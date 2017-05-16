package com.yash.rest.dao;

import java.util.HashMap;
import java.util.Map;

import com.yash.rest.pojo.Todo;

public enum TodoDao {
	instance;
	
	private Map<String, Todo> todos=new HashMap<>();
	
	private TodoDao(){
		// adding some default data
		Todo todo=new Todo("1","task-1");
		todos.put("1", todo);
		
		todo=new Todo("2","task-2");
		todos.put("2", todo);
		
	}

	public Map<String, Todo> getTodos(){
		return todos;
	}
}
