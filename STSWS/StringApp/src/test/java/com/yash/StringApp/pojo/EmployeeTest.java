package com.yash.StringApp.pojo;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void test_employee_details() throws Exception {
		Role role=new Role();
		role.setEmployeeRole("Trainer");
		Employee employee=new Employee(101,"Pankaj Sharma",role);
		String detail=employee.showEmployeeDetail();
		assertEquals("101,Pankaj Sharma,Trainer", detail);
	
	}

	@Test
	public void test_employee_details_for_anySpecified_employee() throws Exception {
		Role role=new Role();
		role.setEmployeeRole("Developer");
		Employee employee=new Employee(102,"Rakesh",role);
		String detail=employee.showEmployeeDetail();
		assertEquals("102,Rakesh,Developer", detail);
	}

	@Test
	public void test_employee_details_for_noId_noName() throws Exception {
		Employee employee=new Employee();
		String detail=employee.showEmployeeDetail();
		assertEquals("0,Unknown,Not Specified",detail);
	}

}
