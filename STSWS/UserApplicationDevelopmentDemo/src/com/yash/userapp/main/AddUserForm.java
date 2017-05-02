package com.yash.userapp.main;

import javax.swing.JOptionPane;

import com.yash.userapp.controller.UserController;

public class AddUserForm {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Enter your name");
		double salary=Double.parseDouble(JOptionPane.showInputDialog("Enter Salary"));
		
		UserController userController=new UserController();
		userController.prepareAndSaveUser(name, salary);

	}

}
