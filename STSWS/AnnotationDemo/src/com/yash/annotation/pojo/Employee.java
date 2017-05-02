package com.yash.annotation.pojo;

public class Employee {

	@Deprecated
	public void get_Salary(){
		System.out.println("gs=bs+hra+da");
	}
	
	
	public void get_New_Salary(){
		System.out.println("gs=bs+hra+da+pf");
	}
}
