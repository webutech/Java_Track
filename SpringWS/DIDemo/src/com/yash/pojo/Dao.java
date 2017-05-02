package com.yash.pojo;

public class Dao {
	
	private String driver;
	private String url;
	private String userName;
	private String password;
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
	
	public void connect(){
		System.out.println("----------Connection successful! with below details-----------");
		System.out.println(getDriver()+" - "+getUrl()+" - "+getUserName()+" - "+getPassword());
	}

}
