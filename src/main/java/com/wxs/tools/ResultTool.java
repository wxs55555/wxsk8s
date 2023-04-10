package com.wxs.tools;

import com.wxs.vo.common.Result;

public class ResultTool {
    public static Result returnResult(String retCode, String retMsg, Object data){
        Result result=new Result(retCode,retMsg);
        result.setData(data);
        return result;
    }
}
