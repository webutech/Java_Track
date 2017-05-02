package com.yash.annotation.pojo;

import com.yash.annotation.annotations.Course;

@Course
public class Student {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
