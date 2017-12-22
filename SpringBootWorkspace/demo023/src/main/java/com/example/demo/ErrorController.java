package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wsh on 2017/12/21.
 *
 * @version 1.0
 */
@Controller
@RequestMapping(value = "error")
public class ErrorController {
    /**
     * 配置400错误转发
     *
     * @return
     */
    @GetMapping(value = "400.html")
    public String badequest() {
        return "error/400";
    }

    /**
     * 配置404错误转发
     *
     * @return
     */
    @GetMapping(value = "404.html")
    public String notFound() {
        return "error/404";
    }

    /**
     * 配置405错误转发
     *
     * @return
     */
    @GetMapping(value = "405.html")
    public String merthodNotAllowed() {
        return "error/405";
    }

    /**
     * 配置500错误转发
     *
     * @return
     */
    @GetMapping(value = "500.html")
    public String serverError() {
        return "error/500";
    }
}
