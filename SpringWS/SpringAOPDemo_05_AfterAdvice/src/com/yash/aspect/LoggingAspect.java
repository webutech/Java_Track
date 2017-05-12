package com.yash.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
/*
 * to convert a class into Aspect, we need to use @Aspect annotation on top of it.
 */
import org.aspectj.lang.annotation.Pointcut;

import com.yash.model.Programmer;
import com.yash.service.PersonService;
@Aspect
public class LoggingAspect {
	
	
	//@Pointcut("within(com.yash.model.Programmer)")
	@Pointcut("execution(* get*())")
	public void forAllMethodsofProgrammer(){}
	
	
	
	@Before("forAllMethodsofProgrammer()")
	public void loggingAdvice(JoinPoint joinPoint){
		System.out.println(joinPoint.toString());
		System.out.println("Advice Run, Get method called");
		
		System.out.println("Target : "+joinPoint.getTarget());
	}
	
	@Before("args(val)")
	public void stringArgumentMethod(String val){
		System.out.println("Method with string argument is called : Value is : "+val);
	}
	
	
	
	
}
