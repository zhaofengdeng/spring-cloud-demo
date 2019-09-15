package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient//向服务中心注册
@SpringBootApplication
@EnableFeignClients
public class EurekaFeignApplication {
	 public static void main(String[] args) {
	        SpringApplication.run(EurekaFeignApplication.class, args);
	    }
}
