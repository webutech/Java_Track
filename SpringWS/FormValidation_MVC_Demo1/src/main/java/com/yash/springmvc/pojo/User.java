package com.yash.springmvc.pojo;

import java.sql.Date;
import java.util.ArrayList;

import javax.validation.constraints.Size;



public class User {
	
	
	@Size(min=1,max=15, message="Please provide the name between {min} and {max} characters")
	private String name;
	private Long contact;
	private String email;
	private Date joiningDate;
	private ArrayList<String> skills=new ArrayList<String>();
	
	private Address userAddress;
	
	
	public Address getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public ArrayList<String> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
