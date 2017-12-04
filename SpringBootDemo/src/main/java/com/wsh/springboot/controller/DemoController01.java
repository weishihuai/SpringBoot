package com.wsh.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.wsh.springboot.entity.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wsh on 2017/12/1.
 */
//返回json数据   标志为restful
@RestController
@RequestMapping("/DemoController01")
public class DemoController01 {

    /**
     * 返回demo数据
     * 请求地址: http://127.0.0.1:8080/DemoController01/demo
     * 返回数据json格式:  {"id": 1,"name": "test"}
     * @return
     */
    @RequestMapping("/demo")
    public Object demo() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("test");
        return demo;
    }

    /**
     * 使用fastjson进行数据解析
     * 注意: 返回值类型为String,不直接返回对象
     * @return
     */
    @RequestMapping("/getFastJson")
    public String getFastJson() {
        Demo demo = new Demo();
        demo.setId(2);
        demo.setName("angel");
        return JSONObject.toJSONString(demo);
    }

    /**
     * 测试统一异常处理
     *
     * @return
     */
    @RequestMapping(value = "/zeroException")
    public int zeroException() {
        return 100 / 0;
    }

}

