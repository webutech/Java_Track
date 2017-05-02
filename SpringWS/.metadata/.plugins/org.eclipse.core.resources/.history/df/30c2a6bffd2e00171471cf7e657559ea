package com.yash.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pojo.DBTest;
public class DBDriverTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resource/beans.xml");
		DBTest dbTest=(DBTest)applicationContext.getBean("dbInfo");
		dbTest.showDBDetail();
	}

}
