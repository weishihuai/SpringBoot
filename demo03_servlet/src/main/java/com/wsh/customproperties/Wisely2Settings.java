package com.wsh.customproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by wsh on 2017/12/4.
 * 使用自定义属性
 */

@ConfigurationProperties(prefix = "wisely2")
public class Wisely2Settings {

    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
