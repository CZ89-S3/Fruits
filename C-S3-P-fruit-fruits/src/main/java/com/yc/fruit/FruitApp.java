package com.yc.fruit;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@MapperScan("com.yc.sq.dao")
public class FruitApp {
	
	public static void main(String[] args) {
		SpringApplication.run(FruitApp.class, args);
	}

}
