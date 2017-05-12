package com.yash.main;

/*
 * Here in this session we will know how you can write pointcut expression, and how you
 * can use best practices while writing pointcut expressions in real world applications. 
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.service.PersonService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		PersonService personService=applicationContext.getBean("personService", PersonService.class);
		System.out.println(personService.getProgrammer().getName());
		

	}

}
