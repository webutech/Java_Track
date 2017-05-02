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
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Employee employee=(Employee)session.get(Employee.class, 1);
		System.out.println("name ----------- > "+employee.getName());
		session.getTransaction().commit();
		session.close();
		System.out.println(employee.getEmployeeAddresses().size());
	}

}
