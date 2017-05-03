package com.yash.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	
	public void registerEmployee(){
		employeeDao.saveEmployee();
	}
}
