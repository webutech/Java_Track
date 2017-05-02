package com.yash.tcma.util;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import com.yash.tcma.service.UserService;
import com.yash.tcma.serviceimpl.UserServiceImpl;

public class ShowMenu {
	private UserService userService=null;
	public ShowMenu() {
		userService=new UserServiceImpl();
	}
	public void showMainMenu(){
		List<String> mainMenu=MenuUtil.getMainMenu();
		int choice = 0;
		for (String menu : mainMenu) {
			System.out.println(menu);
		}
		
		choice=Integer.parseInt(JOptionPane.showInputDialog("Enter your choice"));
		switch (choice) {
		case 1:
			
			break;

		default:
			break;
		}
		
	}

}
