package com.wxs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wxs.mapper")
public class WxsApp {

    public static void main(String[] args) {
        SpringApplication.run(WxsApp.class, args);

    }

}