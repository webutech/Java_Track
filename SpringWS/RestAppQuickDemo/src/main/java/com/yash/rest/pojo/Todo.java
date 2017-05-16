package com.yash.rest.pojo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Todo {
	
	private String id;
	private String task;
	private Date createdDate;
	private boolean completed;
	
	public Todo() {
		this.createdDate=new Date();
		this.completed=false;
	}
	public Todo(String id, String task) {
		this.id=id;
		this.task=task;
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	

}
