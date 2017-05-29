package com.yash.sademo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.sademo.model.User;

@Service
public class UserService {
	List<User> userList=new ArrayList<User>();
	
	public UserService() {
		userList.add(new User(1, "Mohan", "34234234"));
		userList.add(new User(2, "RAM", "34234234"));
		userList.add(new User(3, "Shyam", "34234234"));
		userList.add(new User(1, "Mohan", "34234234"));
		userList.add(new User(2, "RAM", "34234234"));
		userList.add(new User(3, "Shyam", "34234234"));
		userList.add(new User(1, "Mohan", "34234234"));
		userList.add(new User(2, "RAM", "34234234"));
		userList.add(new User(3, "Shyam", "34234234"));
		userList.add(new User(1, "Mohan", "34234234"));
		userList.add(new User(2, "RAM", "34234234"));
		userList.add(new User(3, "Shyam", "34234234"));
		userList.add(new User(1, "Mohan", "34234234"));
		userList.add(new User(2, "RAM", "34234234"));
		userList.add(new User(3, "Shyam", "34234234"));
	}
	
	public List<User> getAllUsers(){
		return userList;
	}
	

}
