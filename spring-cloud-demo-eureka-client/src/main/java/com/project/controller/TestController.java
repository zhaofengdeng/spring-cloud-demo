package com.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.form.TestForm;
import com.project.model.User;

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
	@RequestMapping("/hello4")
	public  TestForm  home4(@RequestBody String name) {
		TestForm form=new TestForm();
		List<User> users=new ArrayList<User>();
		for (int i=0;i<10;i++) {
			User user=new User();
			user.setName(name+i);
			user.setUserPhone("00"+i);
			users.add(user);
		}
		form.name="formName"+name;
		form.users=users;
		return form;
	}
}
