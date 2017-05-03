package com.yash.pojo;

public class EmployeeService {
	private EmployeeDao employeeDao;
	
	
	public EmployeeService() {
		System.out.println("----------EmployeeService(): constructor called----------");
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		System.out.println("----------EmployeeService:setEmployeeDao(EmployeeDao employeeDao)----------------");
		this.employeeDao = employeeDao;
	}
	
	public void registerEmployee(){
		employeeDao.saveEmployee();
	}
}
