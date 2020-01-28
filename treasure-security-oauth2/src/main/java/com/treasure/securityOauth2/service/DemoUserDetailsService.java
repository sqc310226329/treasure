package com.treasure.securityOauth2.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.treasure.securityOauth2.model.SecUser;
import com.treasure.securityOauth2.vo.Permission;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 简述一下～
 * <p>
 *
 * @author 时前程 2020年01月17日
 * @see
 * @since 1.0
 */
@Component
@AllArgsConstructor
@Slf4j
public class DemoUserDetailsService implements UserDetailsService {

    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        //根据 用户名查询用户信息
        SecUser byId = userService.getOne(new QueryWrapper<SecUser>().lambda().eq(SecUser::getUsername, s));
        //根据用户名查询权限
        List<Permission> permissions = userService.queryPermission(s);

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        permissions.stream().forEach(a -> {
            grantedAuthorities.add(new SimpleGrantedAuthority(a.getPermission()));
        });

        log.debug(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("123456"));

        log.info("获取用户信息{}", byId);
//        return  new User(s, PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("123456"), grantedAuthorities);
        return new User(s, byId.getPassword(), grantedAuthorities);
    }
}
