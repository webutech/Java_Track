package com.yash.jdbcapp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.jdbcapp.daoimpl.EmployeeDaoImpl;
import com.yash.jdbcapp.pojo.Employee;

public class ApplicationStatup {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDaoImpl employeeDaoImpl=applicationContext.getBean("employeeDaoImpl",EmployeeDaoImpl.class);
		Employee employee=new Employee();
		employee.setName("Sachit");
		employee.setContact("33333");
		employeeDaoImpl.saveEmployee(employee);
	}

}
