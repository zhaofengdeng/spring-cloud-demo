package com.project.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Value("${server.port}")
    String port;
	/**
	 * 调用方式：String msg = restTemplate.postForEntity("http://eureka-client/hello?name=赵丰登",null, String.class)
				.getBody();
			 String msg = restTemplate.getForEntity("http://eureka-client/hello?name=赵丰登", String.class)
				.getBody();
	 * @param name
	 * @return
	 */
	@RequestMapping("/hello")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am  from port:" + port;
	}
	/**
	 * 调用方式
	 * Map<String, String> map = new HashMap<String, String>();
		map.put("name", "赵丰顺丰单map");
		String msg = restTemplate.postForEntity("http://eureka-client/hello3?name=sfds",map, String.class)
				.getBody();
	 * @return
	 */
	@RequestMapping("/hello3")
	public String home3(@RequestBody String name) {
		return "hi " + name + ",i am  from port:" + port;
	}

	@RequestMapping("/hello2")
	public String home2() {
		return "client=======hello2=============";
	}
}
