package com.yash.sademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.yash.sademo.model.User;
import com.yash.sademo.service.UserService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {
	

	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	@ResponseBody
	public  List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	

}
