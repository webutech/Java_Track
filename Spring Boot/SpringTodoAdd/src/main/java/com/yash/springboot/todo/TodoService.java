package com.yash.springboot.todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	List<Todo> todos=new ArrayList<>(Arrays.asList(
			new Todo("java", "Java Training"),
			new Todo("springboot", "spring boot Training")));

	public List<Todo> getAllTodos() {
		return todos;
	}

	public Todo getTodo(String id) {
		return todos.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTodo(Todo todo) {
		todos.add(todo);
		
	}

	public void updateTodo(String id, Todo todo) {
		for(int i=0;i<todos.size();i++){
			Todo t=todos.get(i);
			if(t.getId().equals(id)){
				todos.set(i, todo);
				return;
			}
		}
		
	}

	public void deleteTodo(String id) {
		todos.removeIf(t->t.getId().equals(id));
		
	}
	
	

}
