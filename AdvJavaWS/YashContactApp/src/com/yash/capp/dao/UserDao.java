package com.yash.capp.dao;

import java.util.List;

import com.yash.capp.domain.User;


public interface UserDao {
	public void insertUser(User user);
	public void deleteUser(int id);
	public List<User> allUser();
	public User showUser();
}
