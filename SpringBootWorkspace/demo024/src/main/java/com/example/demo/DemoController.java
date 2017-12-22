package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wsh on 2017/12/21.
 *
 * @version 1.0
 */

@RestController
@RequestMapping("/application")
public class DemoController {

    @RequestMapping("/test1")
    public Object testSpringUtil1() {
        return ApplicationContextProvider.getBean("testDemo");
    }

}
