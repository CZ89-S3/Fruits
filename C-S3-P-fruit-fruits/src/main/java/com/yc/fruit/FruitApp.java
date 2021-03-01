package com.yc.fruit;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.yc.fruit.dao")
public class FruitApp {
	
	public static void main(String[] args) {
		SpringApplication.run(FruitApp.class, args);
	}

}
