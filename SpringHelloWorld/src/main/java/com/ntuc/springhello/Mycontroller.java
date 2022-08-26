package com.ntuc.springhello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	@RequestMapping("/hello")
	public String sayHello() {
		return "in the second end point";

	}

	@RequestMapping("/")
	public String saySomething() {
		return "Hello Spring Boot";

	}
}
