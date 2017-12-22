package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wsh on 2017/12/19.
 * 修改静态文件的位置
 *
 * @version 1.0
 */
@Configuration
public class StaticResourcesConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 只要访问路径为  /images1/** 就会被映射到 static 文件夹下面
        registry.addResourceHandler("/images1/**").addResourceLocations("classpath:/static/");
    }
}
