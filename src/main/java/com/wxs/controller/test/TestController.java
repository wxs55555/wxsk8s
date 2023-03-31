package com.wxs.controller.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/wxstest")
    public String wxstest(){
        return "wxstest";
    }

}
