package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
public class DemoMybatisApplication {

	public static void main(String[] args) {
		System.out.println("111");
		SpringApplication.run(DemoMybatisApplication.class, args);
	}
}
