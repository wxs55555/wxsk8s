package com.wxs.controller.order;


import com.wxs.service.user.UserService;
import com.wxs.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private UserService userService;

    //进入下单页面
    @RequestMapping("/goToOrderPage")
    public String goToOrderPage(){
        return "goToOrderPage";
    }

    @RequestMapping("/query")
    @ResponseBody
    public List<User> queryMysql(){
        User user=new User();
        user.setId("111111");
        return userService.searchUser(user);
    }
}
