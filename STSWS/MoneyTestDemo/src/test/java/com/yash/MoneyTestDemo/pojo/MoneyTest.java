package com.yash.MoneyTestDemo.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testConstructorForAnyAmountAndAnyCurrency(){
		Money money=new Money(200, "Rs");
		assertEquals(200, money.getAmount());
		assertEquals("Rs", money.getCurrency());
	}

	@Test(expected=IllegalArgumentException.class)
	public void testIllegarArgumentExceptionForAmount(){
		
		try{
		Money money=new Money(-1,"Rs");
		}
		catch(IllegalArgumentException ex){
			System.out.println(ex.getMessage());
		}
	}
	
	

}
