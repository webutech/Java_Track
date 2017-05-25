package com.yash.springboot.todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	@Autowired
	private TodoService todoService;
	
	@RequestMapping("/todos")
	public List<Todo> getAllTodos(){
		return todoService.getAllTodos();
	}
	
	@RequestMapping("/todos/{id}")
	public Todo getTodo(@PathVariable String id){
		return todoService.getTodo(id);
	}
	@RequestMapping(value="/todos",method=RequestMethod.POST)
	public void addTodo(@RequestBody Todo todo){
		todoService.addTodo(todo);
	}
	
	@RequestMapping(value="/todos/{id}", method=RequestMethod.PUT)
	public void updateTodo(@RequestBody Todo todo,@PathVariable String id){
		todoService.updateTodo(id,todo);
	}
	@RequestMapping(value="/todos/{id}", method=RequestMethod.DELETE)
	public void deleteTodo(@PathVariable String id){
		todoService.deleteTodo(id);
	}
}
