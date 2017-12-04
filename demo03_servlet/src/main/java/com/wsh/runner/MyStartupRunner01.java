package com.wsh.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by wsh on 2017/12/4.
 * 服务启动执行
 */
@Component
//@Order 用于指定服务执行的顺序  数值越小越先执行
@Order(value = 2)
public class MyStartupRunner01 implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MyStartupRunner01.class);

    @Override
    public void run(String... strings) throws Exception {
        logger.info("服务启动执行，执行加载数据等操作 11111");
    }
}
