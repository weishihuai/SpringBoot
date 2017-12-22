package com.example.demo.entity;

import java.io.Serializable;

/**
 * Created by wsh on 2017/12/19.
 *
 * @version 1.0
 */
public class BaseEntity implements Serializable{

    protected int page = 1;

    protected int size = 20;

    protected String sidx = "id";


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }
}
