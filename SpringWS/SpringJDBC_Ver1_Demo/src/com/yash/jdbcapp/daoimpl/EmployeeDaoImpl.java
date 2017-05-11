package com.yash.jdbcapp.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

import com.yash.jdbcapp.pojo.Employee;
@Component
public class EmployeeDaoImpl {
	
	
	//1. Collect DB information
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost/springtestdb";
		String user="root";
		String pwd="root";
		private Connection con=null;
		private Statement stmt=null;
		
		public EmployeeDaoImpl() {
			
			System.out.println("--------EmpooyeeDaoImpl: object created---------");
			//2. Register Driver
			try {
				Class c=Class.forName(driverClassName);
				//3. Create Connection, get connection object. 			
				 con=DriverManager.getConnection(url, user, pwd);
				 System.out.println(c);
				 System.out.println(con);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void saveEmployee(Employee employee){
			try{
				//4. Create Statement and execute query
				stmt=con.createStatement();
				String sql="insert into employee (name,contact) values ('"+employee.getName()+"','"+employee.getContact()+"')";
				int i=stmt.executeUpdate(sql);
				System.out.println("Operation performed successfully");
				}
				catch(SQLException ex){
					ex.printStackTrace();
				}
		}
}
