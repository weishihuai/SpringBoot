package com.wsh.fileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo03FileuploadApplication {

	/**
	 * 对文件做一些限制
	 * @return
	 */
//	@Bean
//	public MultipartConfigElement multipartConfigElement() {
//		MultipartConfigFactory factory = new MultipartConfigFactory();
//		//设置文件大小限制
//		factory.setMaxFileSize("128KB");
//		//设置总上传数据总大小
//		factory.setMaxRequestSize("256KB");
//		return factory.createMultipartConfig();
//	}

	public static void main(String[] args) {
		SpringApplication.run(Demo03FileuploadApplication.class, args);
	}
}
