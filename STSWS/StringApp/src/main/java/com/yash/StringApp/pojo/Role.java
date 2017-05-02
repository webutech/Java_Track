package com.yash.StringApp.pojo;

public class Role {
	
	private String employeeRole=new String("Not Specified");
	
	
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	
	@Override
	public String toString() {
		
		return employeeRole;
	}
	

}
