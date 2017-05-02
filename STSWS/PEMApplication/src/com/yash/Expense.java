package com.yash;

import java.util.Date;

/**
 * 
 * @author sharma.pankaj
 *
 */
public class Expense {
	private Long expenseId = System.currentTimeMillis();
	private Long cagetoryId;
	private double amount;
	private Date date;
	private String remark;
	public Expense() {
		super();
	}
	public Expense(Long cagetoryId, double amount, Date date, String remark) {
		super();
		this.cagetoryId = cagetoryId;
		this.amount = amount;
		this.date = date;
		this.remark = remark;
	}
	public Long getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(Long expenseId) {
		this.expenseId = expenseId;
	}
	public Long getCagetoryId() {
		return cagetoryId;
	}
	public void setCagetoryId(Long cagetoryId) {
		this.cagetoryId = cagetoryId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
