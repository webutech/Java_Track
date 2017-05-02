package com.yash.tcma.main;

import javax.swing.JFrame;

import com.yash.tcma.form.RegistrationForm;
import com.yash.tcma.util.ShowMenu;

public class StartApplication {

	public static void main(String[] args) {
		JFrame registrationForm=new RegistrationForm();
		registrationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registrationForm.setTitle("User Registration");
		registrationForm.setSize(350, 200);
		registrationForm.setVisible(true);

	}

}
