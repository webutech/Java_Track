package com.yash.pojo;

public class Employee {
	
	private String name;
	
	private Benefits benefits;
	
	public void setBenefits(Benefits benefits) {
		this.benefits = benefits;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showEmployeeInfo(){
		System.out.println("Name : "+name);
		System.out.println(name+ " gets the salary benefits : "+benefits.isSalaryBenefits());
	}
	
	

}
