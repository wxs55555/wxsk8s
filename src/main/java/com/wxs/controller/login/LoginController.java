package com.wxs.controller.login;


import com.wxs.service.user.UserService;
import com.wxs.tools.ResultTool;
import com.wxs.user.User;
import com.wxs.vo.CommonConstants;
import com.wxs.vo.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Result login(User user){
        try {
            User userRet=userService.login(user);
            if(userRet==null){
                return ResultTool.returnResult(CommonConstants.RET_CODE_ERROR, CommonConstants.RET_MSG_ERROR, null);
            }
            return ResultTool.returnResult(CommonConstants.RET_CODE_SUCESS, CommonConstants.RET_MSG_SUCESS, null);
        }catch (Exception e){
            return ResultTool.returnResult(CommonConstants.RET_CODE_ERROR, CommonConstants.RET_MSG_ERROR, null);
        }
    }
}
