package com.yash.springboot.todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository toDoRepository;	
	
	public List<Todo> getAllTodos() {
		List<Todo> todos=new ArrayList<>();
		toDoRepository.findAll().forEach(todos::add);
		return todos;
	}

	public Todo getTodo(String id) {
		return toDoRepository.findOne(id);
	}

	public void addTodo(Todo todo) {
		toDoRepository.save(todo);		
	}

	public void updateTodo(String id, Todo todo) {
		toDoRepository.save(todo);		
	}

	public void deleteTodo(String id) {
		//todos.removeIf(t->t.getId().equals(id));
		toDoRepository.delete(id);
	}
}
