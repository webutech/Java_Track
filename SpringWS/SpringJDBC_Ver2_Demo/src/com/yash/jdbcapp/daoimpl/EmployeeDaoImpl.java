package com.yash.jdbcapp.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yash.jdbcapp.pojo.Employee;

@Component
public class EmployeeDaoImpl {
	@Autowired
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private Connection con = null;
	private Statement stmt = null;

	public EmployeeDaoImpl() {
	}

	public void saveEmployee(Employee employee) {
		try {
			// 4. Create Statement and execute query
			con=dataSource.getConnection();
			stmt = con.createStatement();
			String sql = "insert into employee (name,contact) values ('" + employee.getName() + "','"
					+ employee.getContact() + "')";
			int i = stmt.executeUpdate(sql);
			System.out.println("Operation performed successfully");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
