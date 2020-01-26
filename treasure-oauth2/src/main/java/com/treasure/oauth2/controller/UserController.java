package com.treasure.oauth2.controller;

import com.treasure.oauth2.model.SecUser;
import com.treasure.oauth2.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 简述一下～
 * <p>
 *
 * @author 时前程 2020年01月23日
 * @see
 * @since 1.0
 */
@RestController
@AllArgsConstructor
public class UserController {

    private IUserService iUserService;

    @RequestMapping("/login")
    public Object login(){
        SecUser byId = iUserService.getById("1072806377661009920");
        System.out.println(byId);
        return byId;
    }
    @RequestMapping("/oauth/test")
    @PreAuthorize("hasAuthority('btn:monitor:online:query')")
    public Object oauthTest(){
        SecUser byId = iUserService.getById("1072806377661009920");
        System.out.println(byId);
        return "===="+byId;
    }
    @RequestMapping("/my/test")
    public Object myTest(){
        SecUser byId = iUserService.getById("1072806377661009920");
        System.out.println(byId);
        return "===="+byId;
    }
}
