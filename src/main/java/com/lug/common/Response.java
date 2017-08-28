package com.lug.common;

import com.fasterxml.jackson.annotation.JsonView;
import com.lug.common.view.View;

public class Response {

    @JsonView(View.Summary.class)
    private int success;

    @JsonView(View.SummaryWithMoreDetail .class)
    private int errorCode;
    @JsonView(View.Summary.class)
    private String msg;

    @JsonView(View.SummaryWithDetail .class)
    private Object content;



    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }



}
