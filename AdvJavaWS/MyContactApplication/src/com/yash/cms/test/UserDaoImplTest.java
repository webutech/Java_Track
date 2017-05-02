package com.yash.cms.test;

import com.yash.cms.dao.UserDao;
import com.yash.cms.daoimpl.UserDaoImpl;
import com.yash.cms.model.User;

public class UserDaoImplTest {

	public static void main(String[] args) {
		UserDao userDao=new UserDaoImpl();
		User user=new User();
//		user.setName("vishakha");
//		user.setPhone("1111111");
//		userDao.insertUser(user);
		
		//testing update
		
		user.setUserid(13);
		user.setName("Vishakha Ranade");
		user.setPhone("3333333");
		user.setEmail("vishakha@yash.com");
		user.setAddress("indore");
		user.setPassword("vishakha123");
		userDao.editUser(user);

	}

}
