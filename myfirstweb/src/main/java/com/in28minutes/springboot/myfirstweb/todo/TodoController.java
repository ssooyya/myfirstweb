package com.in28minutes.springboot.myfirstweb.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

	@RequestMapping("list-todos")
	public String listAllTodos() {
		return "listTodos";
	}
}
