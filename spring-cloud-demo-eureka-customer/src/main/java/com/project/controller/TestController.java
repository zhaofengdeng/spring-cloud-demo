package com.project.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/test")
	public String home() {
	
		String msg = restTemplate.postForEntity("http://eureka-client/hello?name=赵丰登",null, String.class)
				.getBody();
		System.out.println("customer====test=====收到了========"+msg);
		return msg;
	}
	@RequestMapping("/test2")
	public String home2() {
		Map<String, String> map = new HashMap<String, String>();
		String msg = restTemplate.getForEntity("http://eureka-client/hello2", String.class)
				.getBody();
		System.out.println("customer===test2======收到了========"+msg);
		return msg;
	}
	@RequestMapping("/test3")
	public String home3() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "赵丰顺丰单map");
		String msg = restTemplate.postForEntity("http://eureka-client/hello3?name=sfds",map, String.class)
				.getBody();
		System.out.println("customer===test3======收到了========"+msg);
		return msg;
	}
}
