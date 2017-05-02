package com.yash.designpatterns.pojo;

public class Dog extends Animal{
	
	public void attack(){
		System.out.println("Attacked on Enemy");
	}
	
	
	public Dog() {
		super();		
		setSound("Bow Bow...");
	}


	public void changeWeight(int randomWeight) {
		randomWeight=12;
		System.out.println(getName()+"'s weight in changeWeight method : "+randomWeight);
		
	}


	public void changeName(Dog tommy) {
		tommy.setName("Sizu");
		
	}

}
