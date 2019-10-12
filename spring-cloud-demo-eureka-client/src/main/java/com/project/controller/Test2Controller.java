package com.project.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.TestService;

@RestController
@RequestMapping("/test2")
public class Test2Controller {
	@Autowired
	private TestService testService;

	@RequestMapping("/error")
	public String home() throws Exception  {
		return testService.helloService();
	}
}
