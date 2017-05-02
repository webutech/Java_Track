package com.yash.pojo;

public class Animal {
	
	private String name;
	private int age;
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public Animal() {
		
	}
	
	public Animal(int age,String name) {
		this.age=age;
		this.name=name;
	}
	
	
	
	//common functionalities
	
	public void eat(){
	System.out.println(getName()+" is eating : "+getAge());
		
	}
	
	public void run(){
		System.out.println(getName()+" is running : "+getAge());
		
	}

}
