package com.yash.model;

import javax.persistence.Entity;

@Entity
public class ExternalProject extends Project {
	
	private String clientName;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	

}
