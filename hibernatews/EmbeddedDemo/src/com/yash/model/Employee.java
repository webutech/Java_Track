package com.yash.model;


import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;	
	@Column(name="employee_name")
	private String name;
	@Column(name="employee_salary")
	private double salary;	
	@Temporal(TemporalType.TIME)
	private Date joiningDate;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="houseNo", column=@Column(name="home_house_no")),
		@AttributeOverride(name="city", column=@Column(name="home_city_name")),
		@AttributeOverride(name="state", column=@Column(name="home_state_name")),
		@AttributeOverride(name="zip", column=@Column(name="home_zip_code"))
	
	})
	private Address homeAddress;
	
	@Embedded
	private Address officeAddress;
	
	private String aboutEmployee;
	
	

	
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	
	public String getAboutEmployee() {
		return aboutEmployee;
	}
	public void setAboutEmployee(String aboutEmployee) {
		this.aboutEmployee = aboutEmployee;
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
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
