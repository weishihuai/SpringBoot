package com.wsh.entity;

import java.io.Serializable;

public class UserBean implements Serializable {
    //用户名
    private String name;
    //密码
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
