package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wsh on 2017/12/18.
 *
 * @version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello002")
    public String hello001() {
        return "hello002";
    }

}
