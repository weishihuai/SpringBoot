package com.wsh.environment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by wsh on 2017/12/4.
 * 环境变量的读取和属性对象的绑定
 */
@Configuration
public class MyEnvironmentAware implements EnvironmentAware {

    @Value("${myUrl}")
    private String myUrl;

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println(myUrl);
        System.out.println(environment.getProperty("JAVA_HOME"));
    }
}
