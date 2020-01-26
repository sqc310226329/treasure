package com.treasure.oauth2.config;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.treasure.oauth2.Handler.FailHandler;
import com.treasure.oauth2.Handler.SuccessHandler;
import com.treasure.oauth2.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;

/**
 * <p>
 * 简述一下～
 * <p>
 *
 * @author 时前程 2020年01月16日
 * @see
 * @since 1.0
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SuccessHandler successHandler;
    @Autowired
    private FailHandler failHandler;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        MyFilter filter = new MyFilter();
        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)
                .formLogin()
                .loginPage("/signIn.html")
                .loginProcessingUrl("/authentication/form")
                .successHandler(successHandler)
//                .failureHandler(failHandler)
                .and()
                .authorizeRequests()
                .antMatchers("/**/test/").authenticated()
                .antMatchers("/signIn.html").permitAll()
                .anyRequest()
                .authenticated().and().csrf().disable();

    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .passwordEncoder(PasswordEncoderFactories.createDelegatingPasswordEncoder())//在此处应用自定义PasswordEncoder
//                ;
//    }

    public static void main(String[] args) {
        List<Integer> intList = Lists.newArrayList(1, 2, 3, 5, 6);
        Predicate<Integer> predicate = value -> value != 3 && value != 5;
        List<Integer> resultList = Lists.newArrayList(Iterables.filter(intList, predicate));
        System.out.println(resultList);
    }
}

