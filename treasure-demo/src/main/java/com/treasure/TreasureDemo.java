package com.treasure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * 简述一下～
 * <p>
 *
 * @author 时前程 2019年12月20日
 * @see
 * @since 1.0
 */

@SpringBootApplication
@EnableSwagger2
public class TreasureDemo {

    public static void main(String[] args) {
        SpringApplication.run(TreasureDemo.class,args);
    }

}
