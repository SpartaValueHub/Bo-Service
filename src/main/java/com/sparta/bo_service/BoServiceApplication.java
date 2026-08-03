package com.sparta.bo_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoServiceApplication.class, args);
	}

}
