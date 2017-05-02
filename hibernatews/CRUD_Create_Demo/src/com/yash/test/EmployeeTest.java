package com.yash.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yash.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		double salary=1500;
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		for(int i=1;i<=10;i++){
			Employee employee=new Employee();
			employee.setName("Employee "+i);
			employee.setSalary(salary);
			salary+=1000;
			session.save(employee);
		}		
		session.getTransaction().commit();
		session.close();
		
		

	}

}
