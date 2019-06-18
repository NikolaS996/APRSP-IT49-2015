package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableDiscoveryClient
@EnableRetry
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class},scanBasePackages={
		"com.example.demo.reps.CompanyRepository", "com.example.application"})
public class MicroserviceGetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceGetApplication.class, args);
	}

}
