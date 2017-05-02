package com.yash.main;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.yash.annotation.Test;
import com.yash.annotation.TesterInfo;
import com.yash.component.TestDemo;

public class RunTest {

	public static void main(String[] args) {
		System.out.println("Testing........");
		int passed=0, failed=0, count=0, ignored=0;
		Class<TestDemo> obj=TestDemo.class;
		
		//process @Testerinfo
		
		if(obj.isAnnotationPresent(TesterInfo.class)){
			Annotation annotation=obj.getAnnotation(TesterInfo.class);
			TesterInfo testerInfo=(TesterInfo)annotation;
			System.out.printf("%nPriority :%s",testerInfo.priority());
			System.out.printf("%nCreated By :%s",testerInfo.createdBy());
			System.out.printf("%nTags :");
			int tagLength=testerInfo.tags().length;
			for (String tag : testerInfo.tags()) {
				if(tagLength>1){
					System.out.print(tag+", ");
				}
				else{
					System.out.print(tag);
				}
				tagLength--;
			}
			System.out.printf("\nLastModified :  %s%n%n", testerInfo.lastModified());
		
		}
		
		//Process @Test
		for (Method method : obj.getDeclaredMethods()) {
			//if method is annoted with test
			if(method.isAnnotationPresent(Test.class)){
				Annotation annotation=method.getAnnotation(Test.class);
				Test test=(Test)annotation;
				if(test.enabled()){
					try{
						method.invoke(obj.newInstance());
						System.out.printf("%s - Test '%s' - Passed %n", ++count, method.getName());
						passed++;
					}
					
					catch(Throwable ex){
						System.out.printf("%s - Test '%s' - Failed :%s %n",++count, method.getName(), ex.getCause());
						failed++;
						
					}
					
				}
				else{
					System.out.printf("%s - Test '%s' - Ignored%n",++count, method.getName());
					ignored++;
				}
			}
		}
		
		System.out.printf("%nResult : Total : %d, Passed : %d, Failed : %d, Ignored :  %d%n", count, passed, failed, ignored);
	}

}
