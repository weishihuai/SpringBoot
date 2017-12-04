package com.wsh;

import com.wsh.customproperties.Wisely2Settings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ServletComponentScan 这个注解就是扫描相应的Servlet包
@ServletComponentScan
@EnableConfigurationProperties({Wisely2Settings.class})
@ComponentScan(basePackages = {"com.wsh","com.wsh1","com.wsh2"})
public class Demo03ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo03ServletApplication.class, args);
	}
}
