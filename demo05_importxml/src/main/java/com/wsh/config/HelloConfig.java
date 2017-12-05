package com.wsh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by wsh on 2017/12/5.
 * 配置类
 * ImportResource 有两种常用的引入方式：classpath 和 file
 * classpath路径: locations = {"classpath:application-bean.xml","classpath:application-bean2.xml"}
 * file路径: locations= {"file:d:/test/application-bean.xml"}
 *
 */
@Configuration
@ImportResource(locations = {"classpath:application-bean.xml"})
public class HelloConfig {
}
