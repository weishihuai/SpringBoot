package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by wsh on 2017/12/18.
 *
 * @version 1.0
 */
@Controller
public class JspController {

    @RequestMapping("/helloJSP")
    public String helloJSP(Map<String, String> map) {
        map.put("hello", "hello, spring boot jsp");
        //返回视图名称
        return "index";
    }

}
