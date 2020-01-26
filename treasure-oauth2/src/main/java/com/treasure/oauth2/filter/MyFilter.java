package com.treasure.oauth2.filter;

import com.treasure.oauth2.exception.ValidateCodeException;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 * 简述一下～
 * <p>
 *
 * @author 时前程 2020年01月20日
 * @see
 * @since 1.0
 */
public class MyFilter extends OncePerRequestFilter {

    private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
//        System.out.println("我要进行过滤了");
//
//        try {
//            throw new ValidateCodeException("===========sdfsfsdf");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
