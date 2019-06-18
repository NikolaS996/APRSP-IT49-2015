package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableAutoConfiguration
@SpringBootApplication
public class AprspIt492015NikolaSavicApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprspIt492015NikolaSavicApplication.class, args);
	}

}
