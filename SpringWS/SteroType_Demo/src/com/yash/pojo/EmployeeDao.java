package com.yash.pojo;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	public void saveEmployee() {
		System.out.println("---------EmployeeDao:saveEmployee()---------");
		System.out.println("Success : Employee Registed");
		
	}

}
