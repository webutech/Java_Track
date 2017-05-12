package com.yash.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
/*
 * to convert a class into Aspect, we need to use @Aspect annotation on top of it.
 */
@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void loggingAdvice(){
		System.out.println("Advice Run, Get method called");
	}
}
