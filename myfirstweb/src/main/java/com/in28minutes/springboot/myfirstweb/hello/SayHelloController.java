package com.in28minutes.springboot.myfirstweb.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	// "say-hello" > "Hello What are you learning today?"

	// say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello What are you learning today?";
	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML Page-Changed</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First html page with body-Changed");
		sb.append("</body>");
		sb.append("</head>");

		return sb.toString();
	}

	// say-hello-jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}

}
