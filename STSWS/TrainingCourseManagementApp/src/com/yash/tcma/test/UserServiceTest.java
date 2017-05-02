package com.yash.tcma.test;

import com.yash.tcma.dao.UserDao;
import com.yash.tcma.daoimpl.UserDaoImpl;
import com.yash.tcma.pojo.User;
import com.yash.tcma.service.UserService;
import com.yash.tcma.serviceimpl.UserServiceImpl;

public class UserServiceTest {

	public static void main(String[] args) {
		UserService userService=new UserServiceImpl();
		User user=new User();
		user.setFirstName("rajat");
		user.setLastName("gupta");
		user.setUserName("rajat");
		user.setPassword("rajat@12");
		userService.userRegistration(user);
		
		

	}

}
