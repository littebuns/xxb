package com.example.demo.entity;

public class Result {

    private Boolean success;
    private Object data;

    public Result(Boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public Result() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
