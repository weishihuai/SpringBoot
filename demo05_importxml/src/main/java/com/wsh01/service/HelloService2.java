package com.wsh01.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by wsh on 2017/12/5.
 */
@Service
public class HelloService2 {
    private static final Logger logger = LoggerFactory.getLogger(HelloService2.class);

    public HelloService2() {
        logger.info(">>>>>>>>>>HelloService2.HelloService2()>>>>>>>>>");
        logger.info(">>>>>>>>>>HelloService2.HelloService2()>>>>>>>>>");
        logger.info(">>>>>>>>>>HelloService2.HelloService2()>>>>>>>>>");
    }
}
