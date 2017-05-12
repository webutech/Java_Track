package com.yash.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.service.PersonService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		PersonService personService=applicationContext.getBean("personService", PersonService.class);
		System.out.println(personService.getProgrammer().getName());
		/* Now here before the call of getName(), LoggingAspect's loggingAdvice
		 * method will be called first, But this is applied on each getName() method
		 * irrespective of the model class. 
		 * But if we would like to call getName() of specific model, then we will have to
		 * specify the getName() with fully qualified ModelName.
		 * 
		 *  --- Go to LogginAspect's class to check the required changes. 
		 */

	}

}
