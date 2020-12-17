package com.xiaoyu.alidemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com")
@MapperScan({"com.xiaoyu.alidemo.client.mapper", "com.xiaoyu.alidemo.dao.mapper"})
//@MapperScan("com.xiaoyu.alidemo.client.mapper")
//@MapperScan("com.xiaoyu.alidemo.dao.mapper")
public class AlidemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlidemoApplication.class, args);
    }

}
