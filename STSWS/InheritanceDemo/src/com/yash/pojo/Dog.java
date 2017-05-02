package com.yash.pojo;

public class Dog extends Animal{
	
	
	public Dog() {
		this(5,"Tommy");
	}
	
	public Dog(int age,String name) {
		super(age,name);
	}
	
	public void bark(){
		System.out.println(getName()+" is barking : "+getAge());
	}

}
