package com.yash.userapp.serviceimpl;

import com.yash.userapp.dao.UserDao;
import com.yash.userapp.daoimpl.UserDaoImpl;
import com.yash.userapp.pojo.User;
import com.yash.userapp.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao=new UserDaoImpl();
	}

	@Override
	public void addUser(User user) {
		userDao.insertUser(user);

	}

}
