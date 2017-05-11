package com.yash.jdbcapp.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.yash.jdbcapp.pojo.Employee;

@Component
public class EmployeeDaoImpl {
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(this.dataSource);
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
	
	
	public int getTotalEmployees(){
		String sql="select count(*) from employee";
		return jdbcTemplate.queryForInt(sql);
	}
}
