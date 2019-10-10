package com.project.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.config.EmailConfig;

@RestController
@RefreshScope
public class TestController {
	@Value("${account}")
	private String account;
	@Autowired
	private EmailConfig config;
	@RequestMapping("/test")
	public String home() {
		return account+"========"+config.getAccount();
	}
	
}
