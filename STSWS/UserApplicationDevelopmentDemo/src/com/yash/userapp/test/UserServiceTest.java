package com.yash.userapp.test;

import com.yash.userapp.pojo.User;
import com.yash.userapp.service.UserService;
import com.yash.userapp.serviceimpl.UserServiceImpl;

public class UserServiceTest {

	public static void main(String[] args) {
		User user=new User();
		user.setId(101);
		user.setName("TestUser");
		user.setSalary(2000.00);
		
		UserService userService=new UserServiceImpl();
		userService.addUser(user);
		

	}

}
