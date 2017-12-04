package com.wsh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by wsh on 2017/12/4.
 */
@Controller
public class TemplateController {

    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String, Object> map) {
        map.put("hello", "from templateController .helloHtml");
        return "/helloHtml";
    }

    @RequestMapping("/helloFreemarker")
    public String helloFreemarker(Map<String, Object> map) {
        map.put("hello", "from templateController .helloFreemarker");
        return "/helloFreemarker";
    }

}
