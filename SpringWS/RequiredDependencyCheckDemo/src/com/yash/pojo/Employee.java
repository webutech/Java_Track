package com.yash.pojo;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	
	private String name;
	
	private Benefits benefits;
	@Required
	public void setBenefits(Benefits benefits) {
		this.benefits = benefits;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	public void showEmployeeInfo(){
		System.out.println("Name : "+name);
		System.out.println(name+ " gets the salary benefits : "+benefits.isSalaryBenefits());
	}
	
	

}
