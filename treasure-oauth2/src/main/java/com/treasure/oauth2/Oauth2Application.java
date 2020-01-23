package com.treasure.oauth2;

import com.treasure.oauth2.annotation.SysLog;
import com.treasure.oauth2.vo.Dto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * <p>
 * 简述一下～
 * <p>
 *
 * @author 时前程 2020年01月16日
 * @see
 * @since 1.0
 */
@SpringBootApplication
@RestController
public class Oauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2Application.class,args);
    }

    @RequestMapping("/getName")
    public String getStr(){
        return "sc";
    }

    @RequestMapping("/getMe")
    public Object getMe(@AuthenticationPrincipal UserDetails userDetails){
        return userDetails;
    }


    @RequestMapping("/getDto")
    @SysLog(value = "rizhi")
    public Object getDto(){
        Dto dto = new Dto();
        dto.setDateTime(LocalDateTime.now());
        return dto;
    }


}
