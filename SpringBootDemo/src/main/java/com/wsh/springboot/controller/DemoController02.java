package com.wsh.springboot.controller;

import com.wsh.springboot.entity.Demo;
import com.wsh.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wsh on 2017/12/1.
 */
@RestController
@RequestMapping("/DemoController02")
public class DemoController02 {

    @Autowired
    private DemoService demoService;

    /**
     * 测试jpa保存数据
     */
    @RequestMapping("/save")
    public String save() {
        Demo demo = new Demo();
        demo.setName("angel");
        demoService.save(demo);
        return "save success";
    }

    /**
     * 测试jdbcTemplate保存数据
     */
    @PostMapping("/saveDemo")
    public String saveDemo() {
        Demo demo = new Demo();
        demo.setName("angelllllll");
        demoService.saveDemo(demo);
        return "save success";
    }

}

