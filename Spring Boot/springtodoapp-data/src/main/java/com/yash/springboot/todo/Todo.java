package com.yash.springboot.todo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
	@Id
	private String id;
	private String task;
	
	public Todo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Todo(String id, String task) {
		super();
		this.id = id;
		this.task = task;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	

}
