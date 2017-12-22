package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wsh on 2017/12/21.
 *
 * @version 1.0
 */
@Configuration
public class DemoConfig {
    @Bean(name = "testDemo")
    public Demo generateDemo() {
        Demo demo = new Demo();
        demo.setId(12345);
        demo.setName("test");
        return demo;
    }
}
