package com.yash.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeService {
	@Autowired
	@Qualifier(value="empDao1")
	private EmployeeDao empDao;
	
	
	public void registerEmployee(){
		empDao.saveEmployee();
	}
}
