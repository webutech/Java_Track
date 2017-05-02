package com.yash.designpatterns.pojo;

public class Cat extends Animal{
	
	public void attack(){
		System.out.println("Attacked on Enemy");
	}
	
	
	public Cat() {
		super();		
		setSound("Meao Meao...");
	}

}