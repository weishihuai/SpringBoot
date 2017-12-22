package com.example.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wsh on 2017/12/19.
 *
 * @version 1.0
 */
public class SessionInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //登录不做拦截
        if (httpServletRequest.getRequestURI().equals("/user/login") || httpServletRequest.getRequestURI().equals("/user/login_view")) {
            return true;
        }

        Object object = httpServletRequest.getSession().getAttribute("student");
        if (object == null) {
            httpServletResponse.sendRedirect("/user/login_view");
            return false;
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

}
