package com.yash.tddfrombasicdemo.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void constructorShouldSetAmountAndCurrency() {
		Money money=new Money(120, "Rs");
		assertEquals(120, money.getAmount());
		assertEquals("Rs", money.getCurrency());		
	}
}
