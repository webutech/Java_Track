package com.yash.tddfrombasicdemo.pojo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {
	
	private static final Object[] getMoney(){
		return new Object[]{
				new Object[]{120,"Rs"},
				new Object[]{150,"Doller"}
		};
	}
	
	@Test
	@Parameters(method="getMoney")
	public void constructorShouldSetAmountAndCurrency(int amount,String currency){
		Money money=new Money(amount, currency);
		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
		
	}

}
