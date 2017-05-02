package com.yash.cms.service;

import com.yash.cms.model.User;

public interface UserService {
	
	public void userRegistration(User user);
	public User userAuthetication(String userid,String password);

}
