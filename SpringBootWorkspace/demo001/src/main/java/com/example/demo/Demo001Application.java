package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo001Application {

	@RequestMapping("/hello001")
	public String hello001() {
		return "hello001";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo001Application.class, args);
	}
}
