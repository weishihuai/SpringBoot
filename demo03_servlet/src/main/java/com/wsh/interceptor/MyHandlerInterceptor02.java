package com.wsh.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wsh on 2017/12/4.
 * SpringBoot 拦截器的使用方法
 */
public class MyHandlerInterceptor02 implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(MyHandlerInterceptor02.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info("》》》MyHandlerInterceptor02》》》在请求处理之前进行调用，(Controller方法调用之前)");
        return true; //只有返回true才会继续执行下去，返回false取消当前请求
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("》》》MyHandlerInterceptor02》》》在请求处理之后进行调用，但是在视图渲染之前调用(Controller方法调用之后)");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info("》》》MyHandlerInterceptor02》》》在整个请求结束之后进行调用，视图渲染之后调用(主要是用于进行资源清理工作)");
    }
}
