package com.project.service;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {

	@HystrixCommand(fallbackMethod = "helloFallBack")
	public String helloService() throws Exception {
		System.out.println("-=-------------------success-------begin");
		Thread.sleep(50000L);
		System.out.println("-=-------------------success-------end");
		return "success";
	}

	public String helloFallBack() {
		System.out.println("-=-------------------error");
		return "error";
	}
}
