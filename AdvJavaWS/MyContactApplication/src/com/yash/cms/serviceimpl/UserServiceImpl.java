package com.yash.cms.serviceimpl;

import com.yash.cms.dao.UserDao;
import com.yash.cms.daoimpl.UserDaoImpl;
import com.yash.cms.model.User;
import com.yash.cms.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao=null;
	
	public UserServiceImpl() {
		userDao=new UserDaoImpl();
	}

	@Override
	public void userRegistration(User user) {
		userDao.insertUser(user);

	}

	@Override
	public User userAuthetication(String userid, String password) {
		return userDao.getUserByUserIdPassword(userid,password);
	}

}
