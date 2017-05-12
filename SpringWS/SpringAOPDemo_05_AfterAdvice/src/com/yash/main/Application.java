package com.yash.main;

/*
 * Here in this session we will know about joinpoint
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.model.Programmer;
import com.yash.service.PersonService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		PersonService personService=applicationContext.getBean("personService", PersonService.class);
		Programmer programmer=personService.getProgrammer();
		programmer.setName("Priyansh");
		System.out.println(personService.getProgrammer().getName());
		

	}

}
