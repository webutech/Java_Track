package com.yash.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
/*
 * to convert a class into Aspect, we need to use @Aspect annotation on top of it.
 */
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class LoggingAspect {
	
	/*
	 * Case -1
	 * run loggingAdvice for any of the method of Programmer model
	 */
	// configure pointcut for all the subpackages and for all the classes in model or subpackages. 
	
	//@Pointcut("within(com.yash.model..*)")
	
	// This will configure pointcut for all methods withing Programmer class
//	@Pointcut("within(com.yash.model.Programmer)")
//	public void forAllMethodsofProgrammer(){}
//	
//	@Before("forAllMethodsofProgrammer()")
//	public void loggingAdvice(){
//		System.out.println("Advice Run, Get method called");
//	}
	
	/*
	 * Case -2 
	 * Combining pointcuts
	 * we can combine two pointcuts for one type of advice
	 */
	
	@Pointcut("within(com.yash.model.Programmer)")
	public void forAllMethodsofProgrammer(){}
	
	@Pointcut("execution(* get*())")
	public void forAllGetters(){}
	
	@Before("forAllMethodsofProgrammer() && forAllGetters()")
	public void loggingAdvice(){
		System.out.println("Advice Run, Get method called");
	}
	
	@Before("forAllGetters()")
	public void anOtherAdvice(){
		System.out.println("anOther advice executed");
	}
	
	
}
