package com.wsh.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wsh on 2017/12/1.
 */

@Entity
@Table(name = "test_demo")
public class Demo {
    @Id
    @GeneratedValue
    private long id;
    
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
