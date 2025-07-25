package com.in28minutes.springboot.myfirstweb.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;
	
	//정적
	static {
		todos.add(new Todo(++todosCount, "hskwoon", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "hskwoon", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "hskwoon", "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
	}
	
	//목록
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	//등록
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount,username, description, targetDate, done);
		todos.add(todo);
	}
	//삭제
	public void deleteById(int id) {
		// todo.getId() == id
		// todo -> todo.getId() == id
		Predicate<? super Todo> predicate = todo -> todo.getId() == id ;
		todos.removeIf(predicate);
	}
	
	//수정
	
}
