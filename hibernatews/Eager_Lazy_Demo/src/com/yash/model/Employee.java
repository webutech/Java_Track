package com.yash.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

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
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="Addresses",joinColumns=@JoinColumn(name="employee_id"))
	@GenericGenerator(name="hilo-gen", strategy="hilo")
	@CollectionId(columns={@Column(name="Address_id")},
	generator="hilo-gen", type=@Type(type="long"))
	private List<Address> employeeAddresses=new ArrayList<>();
	
	private String aboutEmployee;
	
	
	public List<Address> getEmployeeAddresses() {
		return employeeAddresses;
	}
	public void setEmployeeAddresses(List<Address> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
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
