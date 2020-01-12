package com.treasure.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "测试接口", tags = "UserController")
public class DemoTest {

    /**
     *
     * The Platform will reach the end of its supported life on 9 April 2019. Maintenence releases of both the Brussels and Cairo lines will continue to be published up until that time. Users of the Platform are encourage to start using Spring Boot’s dependency management directory, either by using spring-boot-starter-parent as their Maven project’s parent, or by importing the spring-boot-dependencies bom.
     * @return
     */
    @ApiOperation("获取姓名接口")
    @GetMapping("getName")
    public String getName(){

        return "my name is sqc";
    }
}
