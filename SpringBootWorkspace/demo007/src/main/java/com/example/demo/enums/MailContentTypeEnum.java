package com.example.demo.enums;

/**
 * Created by wsh on 2017/12/19.
 * 发送邮件格式
 *
 * @version 1.0
 */
public enum MailContentTypeEnum {
    HTML("text/html;charset=UTF-8"),
    TEXT("text");
    private String value;

    MailContentTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
