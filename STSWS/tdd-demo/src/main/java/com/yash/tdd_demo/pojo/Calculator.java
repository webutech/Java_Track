package com.yash.tdd_demo.pojo;

import java.util.Arrays;

public class Calculator {

	public int add(String input) {
		
		if(input.isEmpty()){
			return 0;
		}

		
		else{
			return Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).sum();
		}
	}
	
	
}
