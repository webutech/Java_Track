package com.yash.cms.model;

public class Contact extends BaseContact{
	
	private int contactid;
	private String category;

	public int getContactid() {
		return contactid;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
	

}
