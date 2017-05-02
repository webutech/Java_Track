package com.yash.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yash.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		employee.setName("vijay");
		employee.setSalary(2000.00);
		employee.setAddress("H.n. 168 Indore");
		employee.setJoiningDate(new Date());
		employee.setAboutEmployee("Vijay is a nice person");
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
		
		

	}

}
