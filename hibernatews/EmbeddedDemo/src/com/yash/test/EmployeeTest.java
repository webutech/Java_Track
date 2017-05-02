package com.yash.test;

import java.util.Date;

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
		homeAddress.setHouseNo("168-B");
		homeAddress.setCity("Indore");
		homeAddress.setState("MP");
		homeAddress.setZip("462010");
		employee.setHomeAddress(homeAddress);
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
		
		

	}

}
