package com.yash.tcma.dao;

import com.yash.tcma.pojo.User;


/**
 * UserDao will perform DB related activities. 
 * like:
 * insertUser()
 * getUser(String userName,String password)
 * updateUser(int id)
 * @author sharma.pankaj
 *
 */

public interface UserDao {
	
	/**
	 * inserts user in DB based on provided user 
	 * @param user
	 */
	
	public void insertUser(User user);
	/**
	 * return user based on provided username, and password
	 * @param userName
	 * @param password
	 * @return
	 */
	public User getUser(String userName, String password);
	
	/**
	 * update user based on provided id
	 * @param id
	 */
	public void updateUser(int id);
	
}
