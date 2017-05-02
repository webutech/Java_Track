package com.yash.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pojo.Employee;

public class DependencyCheckTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resource/beans.xml");
		Employee employee=(Employee)applicationContext.getBean("employee");
		employee.showEmployeeInfo();

	}

}
