package com.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Value("${server.port}")
    String port;
	@RequestMapping("/hello")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am  from port:" + port;
	}
	@RequestMapping("/hello3")
	public String home3(@RequestBody String name) {
		return "hi " + name + ",i am  from port:" + port;
	}
	
	@RequestMapping("/hello2")
	public String home2() {
		return "client=======hello2=============";
	}
}
