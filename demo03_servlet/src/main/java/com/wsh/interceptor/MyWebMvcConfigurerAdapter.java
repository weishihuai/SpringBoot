package com.wsh.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wsh on 2017/12/4.
 * Web配置
 */
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //多个拦截器组成一个拦截器链
        //addInterceptor 用于添加拦截规则
        //excludePathPatterns 用于排除拦截
        registry.addInterceptor(new MyHandlerInterceptor01()).addPathPatterns("/**");
        registry.addInterceptor(new MyHandlerInterceptor02()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
