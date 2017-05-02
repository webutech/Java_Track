package com.yash.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // will be used on class level
public @interface TesterInfo {
	
	public enum Priority{
		LOW,MEDIUM,HIGH;
	}
	
	Priority priority() default Priority.MEDIUM;
	
	String[] tags() default "";
	
	String createdBy() default "Pankaj";
	
	String lastModified() default "01-11-2016";
}
