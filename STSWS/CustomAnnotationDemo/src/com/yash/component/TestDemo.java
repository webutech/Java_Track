package com.yash.component;

import com.yash.annotation.Test;
import com.yash.annotation.TesterInfo;
import com.yash.annotation.TesterInfo.Priority;

@TesterInfo(
		priority=Priority.HIGH,
		createdBy="Pankaj Sharma",
		tags={"sales","test"})
public class TestDemo {
	
	//default :  fail test
	@Test
	void testA(){
		if(true)
			throw new RuntimeException("This test always failed");
	}
	
	
	
	@SuppressWarnings("unused")
	@Test(enabled = false)
	void testB() {
	  if (false)
		throw new RuntimeException("This test always passed");
	}
	
	@Test(enabled=true)
	void testC(){
		if(10>1){
			// do nothing, this test will always pass
		}
	}
	
	@Test
	void myTestMethod(){
		
	}
	
	

}
