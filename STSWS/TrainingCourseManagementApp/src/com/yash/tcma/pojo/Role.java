package com.yash.tcma.pojo;
/**
 * Defines the role of user like, trainer, trainee, admin, guest
 * @author sharma.pankaj
 *
 */
public class Role {
	/**
	 * id or role
	 */
	private int id;
	/**
	 * name of role, like trainer, trainee, admin, guest
	 */
	private String name;
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
	
	

}
