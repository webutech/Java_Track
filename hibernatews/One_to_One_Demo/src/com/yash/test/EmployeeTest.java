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
		Project project=new Project();
		employee.setName("Masoom");
		employee.setSalary(2000);
		
		project.setName("Jhon-Deer");		
		employee.setProject(project);	
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(employee);
		session.save(project);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
