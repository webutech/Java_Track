package com.yash.tdd_demo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yash.tdd_demo.pojo.Calculator;

public class CalculatorTest {	
	private static final String ANY_VALID_SINGLE_STRING_AS_INPUT = "3";
	private Calculator calculator;
	
	
	
	@After
	public void cleanUp(){
		calculator=null;
	}
	

	@Test
	public void test_empty() throws Exception {
//		Calculator calculator=new Calculator();
		System.out.println("-----test_empty()------calculator : "+calculator.hashCode());
		int result=calculator.add("");
		assertEquals(0, result);
	}

	@Test
	public void test_for_single_value_inputasAnySingleNumber() throws Exception {
//		Calculator calculator=new Calculator();
		System.out.println("-----test_for_single_value_inputasAnySingleNumber------calculator : "+calculator.hashCode());
		int result=calculator.add(ANY_VALID_SINGLE_STRING_AS_INPUT);
		assertEquals(3, result);
	}
	
	@Before
	public void setUp(){
		 calculator = new Calculator();
		 System.out.println("calculator ----setUp(): "+calculator);
	}

	@Test
	public void test_two_numbers_separated_by_comma_return_sum_of_input() throws Exception {
//		Calculator calculator=new Calculator();
		System.out.println("-----test_two_numbers_separated_by_comma_return_sum_of_input()------calculator : "+calculator.hashCode());
		int result=calculator.add("100,200");
		assertEquals(300, result);
	}	
}


