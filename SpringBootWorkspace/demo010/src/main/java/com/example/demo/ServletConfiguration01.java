package com.example.demo;

import com.example.demo.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wsh on 2017/12/19.
 * SpringBoot注册Servlet
 * 方式一： 使用@Bean方式
 *
 * @version 1.0
 */
@Configuration
public class ServletConfiguration01 {

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new MyServlet(), "/test");
    }

}
