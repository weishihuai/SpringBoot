package com.wsh.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wsh on 2017/12/1.
 * 自定义目录 资源映射
 * 例如 访问myres文件夹下面的test.jpg
 * 访问地址： http://localhost:8080/myres/test.jpg
 */

@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");
        super.addResourceHandlers(registry);

        //如果我们要指定一个绝对路径的文件夹（D:/data/api_files），则只需要使用addResourceLocations指定即可
//        registry.addResourceHandler("/api_files/**").addResourceLocations("file:D:data/api_files");

    }




}
