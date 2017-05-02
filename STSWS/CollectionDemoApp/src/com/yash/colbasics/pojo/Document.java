package com.yash.colbasics.pojo;

public class Document {
	private int id;
	private String name;
	private String description;
	private int createdBy; // created by
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Document(int id, String name, String description, int createdBy) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.createdBy = createdBy;
	}
	
	@Override
	public String toString() {
		return "Title : "+getName()+", Description : "+getDescription()+", CreatedBy : "+getCreatedBy();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(((Document)obj).getName().equals(this.getName())){
			return true;
		}
		else{
		
		return false;
		}
	}
	
}
