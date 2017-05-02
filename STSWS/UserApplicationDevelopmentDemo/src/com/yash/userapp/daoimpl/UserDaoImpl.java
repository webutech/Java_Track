package com.yash.userapp.daoimpl;

import com.yash.userapp.dao.UserDao;
import com.yash.userapp.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void insertUser(User user) {
		// Database logic to save user in DB
		System.out.println("------User saved successfully with below detail--------");
		System.out.println("Name : "+user.getName());
		System.out.println("Salary : "+user.getSalary());

	}

}
