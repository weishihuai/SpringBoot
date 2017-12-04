package com.wsh.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by wsh on 2017/12/4.
 * SpringBoot 监听器的使用方法
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

    private static final Logger logger = LoggerFactory.getLogger(MyServletContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("SpringBoot MyServletContextListener监听器 ======》 初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("SpringBoot MyServletContextListener监听器 ======》 销毁");
    }
}
