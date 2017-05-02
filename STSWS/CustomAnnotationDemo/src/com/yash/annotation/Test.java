package com.yash.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) // this annotation will be used on Method level only
public @interface Test {

	//should ignore this test?
	public boolean enabled() default true; // 
	
}
