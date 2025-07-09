package com.in28minutes.springboot.myfirstweb.hello;

import org.springframework.web.bind.annotation.RequestMapping;

public class SayHelloController {

	//"say-hello" > "Hello What are you learning today?"
	
	
	//say-hello
	@RequestMapping("/say-hello")
	public String sayHello() {
		return "Hello What are you learning today?";
	}
}
