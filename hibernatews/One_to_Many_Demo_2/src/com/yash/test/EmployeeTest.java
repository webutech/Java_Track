package com.yash.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yash.model.Address;
import com.yash.model.Employee;
import com.yash.model.Project;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		Project project1=new Project();
		Project project2=new Project();
		employee.setName("Masoom");
		employee.setSalary(2000);
		
		project1.setName("Jhon-Deer");	
		project2.setName("Barter");	
		employee.getProjects().add(project1);
		employee.getProjects().add(project2);
		
		
		project1.setEmployee(employee);
		project2.setEmployee(employee);
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();		
		session.save(employee);
		session.save(project1);
		session.save(project2);		
		session.getTransaction().commit();
		session.close();
		
	}

}
