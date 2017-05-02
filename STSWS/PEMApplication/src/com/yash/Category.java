package com.yash;
/**
 * 
 * @author sharma.pankaj
 *
 */

public class Category {
	
	private Long categoryId=System.currentTimeMillis();
	private String name;
	
	public Category() {
		
	}
	
	

	public Category(String name) {
		super();
		this.name = name;
	}



	public Category(Long categoryId, String name) {
		this.categoryId = categoryId;
		this.name = name;
	}



	public Long getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
