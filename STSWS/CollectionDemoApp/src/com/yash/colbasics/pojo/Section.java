package com.yash.colbasics.pojo;

public class Section {
	private int id;
	private String name;
	private int createdBy;
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
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Section(int id, String name, int createdBy) {
		super();
		this.id = id;
		this.name = name;
		this.createdBy = createdBy;
	}
	
	

}
