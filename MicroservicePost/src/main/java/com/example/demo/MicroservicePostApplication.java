package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients("post")
@SpringBootApplication(scanBasePackages={"com.example.demo.reps.FeignRepository", "com.example.application"})
public class MicroservicePostApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicePostApplication.class, args);
	}

}
