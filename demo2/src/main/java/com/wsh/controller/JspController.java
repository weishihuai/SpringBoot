package com.wsh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by wsh on 2017/12/4.
 * 测试SpringBoot 支持jsp
 */
//@RestController 记住不能写@RestController,不然会以为返回helloJsp这个字符串显示在页面
@Controller
public class JspController {

    @Value("${application.hello}")
    private String hello;

    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String, Object> map) {
        System.out.println("=============" + hello);
        map.put("hello", hello);
        return "helloJsp";
    }

}
