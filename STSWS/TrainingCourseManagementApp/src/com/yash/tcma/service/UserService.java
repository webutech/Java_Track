package com.yash.tcma.service;

import com.yash.tcma.pojo.User;

/**
	 * UserService will perform below operations
	 * 1. Registration
	 * 2. login
	 * 3. view course
	 * 4. add course
	 * 5. change status
	 * 6. change role
	 * 7. 
	 */

public interface UserService {
	
	public void userRegistration(User user);
	
	public User userAuthentication(String userName,String password);
	
	

}
