package com.yash.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yash.model.Address;
import com.yash.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		employee.setName("vijay");
		employee.setSalary(2000.00);
		
		employee.setJoiningDate(new Date());
		employee.setAboutEmployee("Vijay is a nice person");
		Address homeAddress=new Address();
		Address officeAddress=new Address();
		homeAddress.setCity("Indore");
		homeAddress.setHouseNo("168-B");
		homeAddress.setState("MP");
		homeAddress.setZip("462010");
		
		officeAddress.setCity("Indore");
		officeAddress.setHouseNo("YASH");
		officeAddress.setState("MP");
		officeAddress.setZip("462010");
		
		employee.getEmployeeAddresses().add(homeAddress);
		employee.getEmployeeAddresses().add(officeAddress);
		
		
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
		
		

	}

}
