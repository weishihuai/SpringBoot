package com.example.demo.handler;

import java.io.Serializable;

/**
 * Created by wsh on 2017/12/20.
 *
 * @version 1.0
 */
public class ApiResult implements Serializable {

    private ApiResult() {

    }

    public static ApiResult newInstance() {
        return new ApiResult();
    }

    private String msg;
    private boolean flag = false;
    private Object result;
    private int rows;
    private String jumpUrl;
    private long time;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
