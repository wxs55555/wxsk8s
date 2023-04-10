package com.wxs.vo.common;

public class Result<T> {

    public Result(String retCode,String retMsg){
        this.retCode=retCode;
        this.retMsg=retMsg;
    }
    public Result(){
    }
    /**
     * 响应状态码
     */
    private String retCode;
    /**
     * 响应提示信息
     */
    private String retMsg;
    /**
     * 响应结果对象
     */
    private T data;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "retCode='" + retCode + '\'' +
                ", retMsg='" + retMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
