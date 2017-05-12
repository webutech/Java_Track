package com.yash.main;

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
