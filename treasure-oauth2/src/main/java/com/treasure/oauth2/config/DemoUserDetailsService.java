package com.treasure.oauth2.config;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.stereotype.Component;

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
public class DemoUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return  new User(s, PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("123456"), AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
