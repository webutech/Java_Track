package com.yash.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yash.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		String sal="4500";
		String name="Employee 4";
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Query query=session.createQuery("select name from  Employee where salary=:salary and name=:name");
		query.setDouble("salary", Double.parseDouble(sal));
		query.setString("name", name);
		List<String>  empList=query.list();
		session.getTransaction().commit();
		session.close();		
		for (String employee : empList) {
			System.out.println(employee);
		}
		
	}
}
