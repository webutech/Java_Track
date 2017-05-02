package com.yash.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pojo.Training;

public class CollectionDemoDriverClass {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resource/beans.xml");
		Training yashTraining=(Training)applicationContext.getBean("yashTraining");
		yashTraining.showDetail();
	}

}
