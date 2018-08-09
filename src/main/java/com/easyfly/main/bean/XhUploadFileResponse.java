package com.easyfly.main.bean;

import java.util.List;

public class XhUploadFileResponse {
    List<UploadFileResultBean> result;
    String msg;
    int code;

    public List<UploadFileResultBean> getResult() {
        return result;
    }

    public void setResult(List<UploadFileResultBean> result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
