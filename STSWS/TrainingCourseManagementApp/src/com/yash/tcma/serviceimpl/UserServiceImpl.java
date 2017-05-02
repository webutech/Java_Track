package com.yash.tcma.serviceimpl;

import com.yash.tcma.dao.UserDao;
import com.yash.tcma.daoimpl.UserDaoImpl;
import com.yash.tcma.pojo.User;
import com.yash.tcma.service.UserService;

public class UserServiceImpl implements UserService {
	
	UserDao userDao=null;
	
	public UserServiceImpl() {
		userDao=new UserDaoImpl();
	}

	@Override
	public void userRegistration(User user) {
		userDao.insertUser(user);

	}

	@Override
	public User userAuthentication(String userName, String password) {
		
		return null;
	}

}
