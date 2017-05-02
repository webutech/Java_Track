package com.yash.pojo;

import java.util.Properties;
import java.util.Set;

public class DBTest {

	private Properties dataBaseInformation;	
	public void setDataBaseInformation(Properties dataBaseInformation) {
		this.dataBaseInformation = dataBaseInformation;
	}	
	
	public void showDBDetail(){
		Set keys=dataBaseInformation.keySet();
		
		for (Object key : keys) {
			System.out.println(key+" : "+dataBaseInformation.getProperty(key.toString()));			
		}
	}
}
