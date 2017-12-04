package com.wsh.springboot.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wsh on 2017/12/1.
 * 统一异常处理
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    Logger logger = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest request, Exception exception) {

        //打印异常信息
        exception.printStackTrace();
        logger.error("GlobalDefaultExceptionHandler.defaultErrorHandler()");

        /**
         * 返回视图
         * 定义一个ModelAndView即可
         * 然后 return
         * 定义视图文件 （error.html/error.jsp..）
         */
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception",exception);
//        modelAndView.addObject("url",request.getRequestURL());
//        return modelAndView;

        /**
         * 返回json数据或者String数据
         * 那么需要在方法上加上注解： @ResponseBody
         * 添加return即可
         */

    }

}
