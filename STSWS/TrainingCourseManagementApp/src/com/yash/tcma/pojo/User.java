package com.yash.tcma.pojo;

import java.sql.Date;

/**
 * it defines the type of user in the Training Course Management app
 * user could be trainer, trainee, admin, or guest based of role
 * by default user should be added as inactive and guest
 * @author sharma.pankaj
 *
 */
public class User {
	/**
	 * id of user
	 */
	private int id;
	/**
	 * firstName of user
	 */
	private String firstName;
	/**
	 * lastName of user
	 */
	private String lastName;
	/**
	 * email of user
	 */
	private String email;
	/**
	 * contact of user
	 */
	private String contact;
	/**
	 * status Id of user comming from status table, it is a FK
	 */
	private int statusId; // FK
	/**
	 * role Id of user comming from role table, it is a FK
	 */
	private int roleId; // FK
	/*
	 * userName of user, for login
	 */
	private String userName;
	/**
	 * password of user, for login
	 */
	private String password;
	/**
	 * CreatedDate of user registration, will be automatically set at the time of user 
	 * registration. 
	 */
	private Date createdDate;
	/**
	 * modifiedDate of user updation, will be automatically set at the time of user
	 * updation
	 */
	private Date modifiedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	
	
	

}
