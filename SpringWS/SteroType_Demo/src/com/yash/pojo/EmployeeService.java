package com.yash.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class EmployeeService {
	@Autowired
	private EmployeeDao empDao;
	
	
	public void registerEmployee(){
		empDao.saveEmployee();
	}
}
