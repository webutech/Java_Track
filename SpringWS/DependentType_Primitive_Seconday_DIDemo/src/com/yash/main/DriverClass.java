package com.yash.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pojo.Trainee;

public class DriverClass {

	public static void main(String[] args) {
		String[] files=new String[]{"resource/course.xml","resource/trainee.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		Trainee trainee=(Trainee)applicationContext.getBean("trainee");
		trainee.showEnrollMentDetail();
	}

}
