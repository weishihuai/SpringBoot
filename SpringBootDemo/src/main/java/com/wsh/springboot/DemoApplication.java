package com.wsh.springboot;

import com.wsh.util.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = {SpringUtil.class})
public class DemoApplication {

//	@Bean
//	public SpringUtil getSpringUtil() {
//		return new SpringUtil();
//	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
