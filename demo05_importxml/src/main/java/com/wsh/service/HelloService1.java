package com.wsh.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by wsh on 2017/12/5.
 */
@Service
public class HelloService1 {

    private static  final Logger logger = LoggerFactory.getLogger(HelloService1.class);

    public HelloService1() {
        logger.info(">>>>>>>>>>HelloService1.HelloService1()>>>>>>>>>");
        logger.info(">>>>>>>>>>HelloService1.HelloService1()>>>>>>>>>");
        logger.info(">>>>>>>>>>HelloService1.HelloService1()>>>>>>>>>");
    }

}
