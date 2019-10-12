package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
//允许断路器
@EnableCircuitBreaker
public class EurekaClientApplication {
	 public static void main(String[] args) {
	        SpringApplication.run(EurekaClientApplication.class, args);
	    }
}
