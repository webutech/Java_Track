package com.yash.userapp.controller;

import com.yash.userapp.pojo.User;
import com.yash.userapp.service.UserService;
import com.yash.userapp.serviceimpl.UserServiceImpl;

public class UserController {
	
	// 1. prepare data
	
	User user;
	UserService userService;
	
	public UserController() {
		user=new User();
		userService=new UserServiceImpl();
	}
	
	public void prepareAndSaveUser(String name, double salary){
		// 2. Prepare model
		user.setName(name);
		user.setSalary(salary);
		userService.addUser(user);
				
	}

}
