package com.yash.jdbcapp.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
		String sql="insert into employee(name,contact) values (?,?)";
		jdbcTemplate.update(sql, new Object[]{employee.getName(),employee.getContact()});
		System.out.println("Success :  Employee Saved!");
	}
	
	
	public int getTotalEmployees(){
		String sql="select count(*) from employee";
		return jdbcTemplate.queryForInt(sql);
	}
	
	public String getEmployeeName(int id){
		return jdbcTemplate.queryForObject("select name from employee where id=?",new Object[]{id}, String.class);
	}
	
	
	public Employee getEmployeeById(int id){
		return jdbcTemplate.queryForObject("select * from employee where id=?",new Object[]{id},new EmployeeRowMapper());
		
	}
	
	
	public List<Employee> getAllEmployee(){
		return jdbcTemplate.query("select * from employee",new EmployeeRowMapper());
	}
	// Inner class
	
	private static final class EmployeeRowMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Employee employee=new Employee();
			employee.setName(resultSet.getString("name"));
			employee.setContact(resultSet.getString("contact"));
			return employee;
		}
		
	}
	
}
