package com.yash.tcma.form;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame{
	
	private JLabel firstName;
	private JLabel lastName;
	private JLabel userName;
	private JLabel password;
	private JTextField jFirstName;
	private JTextField jLastName;
	private JTextField jUserName;
	private JPasswordField jPassword;
	private JButton jregistrationBtn;
	
	
	public RegistrationForm() {
		this.setLayout(new FlowLayout());
		firstName=new JLabel("First Name : ");
		jFirstName=new JTextField(20);
		lastName=new JLabel("Last Name : ");
		jLastName=new JTextField(20);
		userName=new JLabel("User Name : ");
		jUserName=new JTextField(20);
		password=new JLabel("password : ");
		jPassword=new JPasswordField(20);
		jregistrationBtn=new JButton("Registration");
		
		
		this.add(firstName);
		this.add(jFirstName);
		this.add(lastName);
		this.add(jLastName);
		this.add(userName);
		this.add(jUserName);
		this.add(password);
		this.add(jPassword);
		this.add(jregistrationBtn);
	
	}

}
