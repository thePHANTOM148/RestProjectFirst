package com.springdemo.demospring.Error;

import org.springframework.http.HttpStatus;

public class ErrorEntity {
    private HttpStatus status;
    private String msg;
    public ErrorEntity(HttpStatus httpStatus, String message) {
        this.status = httpStatus;
        this.msg = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

