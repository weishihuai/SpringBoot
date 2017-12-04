package com.wsh.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by wsh on 2017/12/4.
 * SpringBoot 监听器的使用方法
 */
@WebListener
public class MySessionListener implements HttpSessionListener{
    private static final Logger logger = LoggerFactory.getLogger(MySessionListener.class);

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        logger.info("SpringBoot session ======》 初始化");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        logger.info("SpringBoot session ======》 销毁");
    }
}
