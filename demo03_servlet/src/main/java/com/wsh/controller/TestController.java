package com.wsh.controller;

import com.wsh.customproperties.Wisely2Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wsh on 2017/12/4.
 */

@RestController
public class TestController {

    @Autowired
    private Wisely2Settings wisely2Settings;

    @RequestMapping(value = "/test")
    public String test() {
        System.out.println("======"+ wisely2Settings.getGender() +"======");
        System.out.println("======"+ wisely2Settings.getName() +"======");
        return "ok";
    }

}
