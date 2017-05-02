package com.yash.StringApp.pojo;

import java.util.Date;

import javax.print.attribute.standard.JobOriginatingUserName;

public class Employee {
	
	private int id;
	private String employeeName=new String("Unknown");
	private Role role;
	

	public Employee(int id, String employeeName, Role role) {
		
		this.id=id;
		this.employeeName=employeeName;
		this.role=role;
	
	}
	
	public Employee() {
		//this.employeeName="Unknown";
	}

	public int getId() {
		return id;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public Role getRole() {
		return role;
	}
	
	public String showEmployeeDetail(){
		System.out.println("id "+id);
		System.out.println("Name : "+employeeName);
		System.out.println("Role : "+role);
		return getId()+","+getEmployeeName();
	}

}
