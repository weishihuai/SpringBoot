package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wsh on 2017/12/20.
 *
 * @version 1.0
 */
@RestController
public class IndexController {

    @RequestMapping("/index/{number}")
    public String index(@PathVariable("number") int number) {
        System.out.println(20 / number);
        return "hahahha";
    }

}
