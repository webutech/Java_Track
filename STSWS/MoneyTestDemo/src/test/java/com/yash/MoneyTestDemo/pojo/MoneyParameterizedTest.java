package com.yash.MoneyTestDemo.pojo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {
	
	// data preparation method
	
	public Object[] getData(){
		return new Object[]{
				new Object[]{120,"Rs"},
				new Object[]{150,"Doller"}
		};
	}
	
	@Test
	@Parameters(method="getData")
	public void testConstructorForAnyAmountAndAnyCurrency(int amount,String currency) {
		Money money=new Money(amount, currency);
		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
		
	}
	

}
