package com.yash.MoneyTestDemo.pojo;

public class Money {

	private final int amount;
	private final String currency;
	
	public Money(int amount, String currency) {
		if(amount<0){
			throw new IllegalArgumentException("Invalid Argument : "+"["+amount+"]");
		}
		this.amount = amount;
		this.currency = currency;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}
	
}
