package com.treasure.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 简述一下～
 * <p>
 *
 * @author 时前程 2020年01月27日
 * @see
 * @since 1.0
 */
@RestController
public class DemoController {
    @RequestMapping("/oauth/test")
    @PreAuthorize("hasAuthority('btn:monitor:online:query')")
    public Object oauthTest(){
        return "=test  demo===";
    }
}
