package com.yash.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yash.rest.dao.TodoDao;
import com.yash.rest.pojo.Todo;

public class TodoService {
	TodoDao todoDao;
	
	public TodoService() {
		todoDao=TodoDao.instance;
	}
	
	public void createTodo(Todo todo){
		todoDao.getTodos().put(todo.getId(), todo);
	}
	
	public Todo getTodo(String id){
		return todoDao.getTodos().get(id);
	}
	
	public Map<String, Todo> getTodos(){
		return todoDao.getTodos();
	}
	
	public List<Todo> getTodosAsList(){
		List<Todo> todoList=new ArrayList<>();
		todoList.addAll(todoDao.getTodos().values());
		return todoList;
	}
	
	public int getTodosCount(){
		return todoDao.getTodos().size();
	}
	
	public void deleteTodo(String id){
		todoDao.getTodos().remove(id);
	}
}
