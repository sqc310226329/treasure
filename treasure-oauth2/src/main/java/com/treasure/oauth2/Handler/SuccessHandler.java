package com.treasure.oauth2.Handler;

import com.alibaba.fastjson.JSON;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

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
@Component
public class SuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentication) throws IOException, ServletException {

        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(JSON.toJSONString(authentication));
    }
}
