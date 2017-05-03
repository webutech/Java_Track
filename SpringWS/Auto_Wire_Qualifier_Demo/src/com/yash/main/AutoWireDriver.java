package com.yash.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.pojo.EmployeeService;
public class AutoWireDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resource/beans.xml");
		EmployeeService employeeService=(EmployeeService)applicationContext.getBean("epmSer");
		employeeService.registerEmployee();
	}
}
