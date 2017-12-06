package com.wsh.controller;

import com.wsh.service.DemoInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wsh on 2017/12/6.
 *
 * @version 1.0
 */
@RestController
public class DemoInfoController {

    Logger logger = LoggerFactory.getLogger(DemoInfoController.class);

    @Autowired
    private DemoInfoService demoInfoService;

    @RequestMapping("/test/{id}")
    public String test(@PathVariable(value = "id") Long id) {
        Long startTime = System.currentTimeMillis();
        demoInfoService.findById(id);
        logger.error("耗时:" + (System.currentTimeMillis() - startTime));
        return "ok";
    }


}
