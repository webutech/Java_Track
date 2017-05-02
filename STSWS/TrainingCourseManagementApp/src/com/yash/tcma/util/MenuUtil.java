package com.yash.tcma.util;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {
	
	private static List<String> adminMenu=new ArrayList<>();
	private static List<String> trainerMenu=new ArrayList<>();
	private static List<String> traineeMenu=new ArrayList<>();
	private static List<String> mainMenu=new ArrayList<>();
	public static List<String> getAdminMenu() {
		adminMenu.add("1. show all users");
		adminMenu.add("2. update user");
		return adminMenu;
	}
	public static List<String> gettrainerMenu() {
		trainerMenu.add("1. create course");
		trainerMenu.add("2. Update course");
		return trainerMenu;
	}
	public static List<String> getTraineeMenu() {
		traineeMenu.add("1. show all courses");
		traineeMenu.add("2. show course by name");
		return traineeMenu;
	}
	public static List<String> getMainMenu() {
		mainMenu.add("1. Registration");
		mainMenu.add("2. Login");
		return mainMenu;
	}
	
	
	

}
