package com.yash.webserviceapp.simple_webservice_demo.pojo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Project {
	private int id;
	private String name;
	private Date created;
	private String manger;
	
	public Project(){
		// in case of xml or json converters you will need default constructor
	}
	
	public Project(int id, String name, Date created, String manger) {
		super();
		this.id = id;
		this.name = name;
		this.created = created;
		this.manger = manger;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getManger() {
		return manger;
	}
	public void setManger(String manger) {
		this.manger = manger;
	}
	
	

}
