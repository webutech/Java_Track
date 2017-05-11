package com.yash.jdbcapp.main;

import com.yash.jdbcapp.daoimpl.EmployeeDaoImpl;
import com.yash.jdbcapp.pojo.Employee;

public class ApplicationStatup {

	public static void main(String[] args) {
		EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
		Employee employee=new Employee();
		employee.setName("Masoom");
		employee.setContact("22229");
		employeeDaoImpl.saveEmployee(employee);
	}

}
