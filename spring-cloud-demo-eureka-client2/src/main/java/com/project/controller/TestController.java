package com.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Value("${server.port}")
    String port;
	@RequestMapping("/hello")
	public String home(@RequestParam String name) {
		return "3========hi " + name + ",i am  from port:" + port;
	}
}
