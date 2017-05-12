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
	 * Executing loggingAdvice for getName of Programmer
	 * --------------------------------------------------
	 */

//	@Before("execution(public String com.yash.model.Programmer.getName())")
//	public void loggingAdvice(){
//		System.out.println("Advice Run, Get method called");
//	}
	/*
	 * Case -2
	 * Executing loggingAdvice for any of the getter
	 * ------------------------------------------------
	 * IF we want to call loggingAdvice before any of the getter, whether it is of service getter
	 * or model getter,
	 * because as you can observe the call of getName() method, it is called based on the getter of
	 * programmer or tester. 
	 * here we will have to use the wild card character (*)
	 * below is the same loggingAdvice method that will be called for any of the getter. 
	 */
	
//	@Before("execution(public * get*())")
//	public void loggingAdvice(){
//		System.out.println("Advice Run, Get method called");
//	}
	
	/*
	 * Case - 3
	 * Executing any getter whether it is private or public , or whether it takes parameter or not
	 * ----------------------------------------------------------------
	 * Below code will be called for any of the getter, whether it is private or public
	 * and whether that getter takes parameter or does not take.  
	 */
//	@Before("execution(* get*(..))")
//	public void loggingAdvice(){
//		System.out.println("Advice Run, Get method called");
//	}
	
	/*
	 * Case -4
	 * 
	 * Below code will run the advice for all the getters of all models presented in 
	 * com.yash.model package  
	 */
//	@Before("execution(* com.yash.model.*.get*(..))")
//	public void loggingAdvice(){
//		System.out.println("Advice Run, Get method called");
//	}
	
	/*
	 * Case -5
	 * Executing two advices on one method. 
	 */
	
//	@Before("execution(public * getName())")
//	public void loggingAdvice(){
//		System.out.println("Advice Run, Get method called");
//	}
//	
//	@Before("execution(public * getName())")
//	public void anotherAdvice(){
//		System.out.println("Another advice Executed");
//	}
	
	/*
	 * Case -6
	 * Pointcut
	 * ---------------
	 * In the above code the same expression is applied on multiple methods, 
	 * in this case if there is a requirement to change the expression for all methods. 
	 * Then this is going to be bit difficult. 
	 * The problem will be resolved by the pointcut.
	 * PointCut : - it is a common code where the common expression can be put and this point cut will 
	 * be applied on all required methods which will implement the advice. 
	 * 
	 * Through the below code you will achieve the same effect. 
	 * here forAllGetNameMethod() method is a pointcut holder.which will be provided in different advices. 
	 */
	
	@Before("forAllGetNameMethods()")
	public void loggingAdvice(){
		System.out.println("Advice Run, Get method called");
	}
	
	@Before("forAllGetNameMethods()")
	public void anotherAdvice(){
		System.out.println("Another advice Executed");
	}
	
	@Pointcut("execution(public * getName())")
	public void forAllGetNameMethods(){}
}
