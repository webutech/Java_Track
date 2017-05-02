package com.yash.tcma.test;

import com.yash.tcma.dao.UserDao;
import com.yash.tcma.daoimpl.UserDaoImpl;
import com.yash.tcma.pojo.User;

public class UserDaoImplTest {

	public static void main(String[] args) {
		UserDao userDao=new UserDaoImpl();
		User user=new User();
		user.setFirstName("masoom");
		user.setLastName("badkur");
		user.setUserName("masoom");
		user.setPassword("masoom@12");
		
		userDao.insertUser(user);

	}

}
