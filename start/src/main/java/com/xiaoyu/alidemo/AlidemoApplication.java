package com.xiaoyu.alidemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class AlidemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlidemoApplication.class, args);
    }

}
