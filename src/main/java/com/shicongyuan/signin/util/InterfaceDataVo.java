package com.shicongyuan.signin.util;

public class InterfaceDataVo {

    public Object data; //数据
    public String message; //错误信息
    public String status ; //成功标志0成功,1失败

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
