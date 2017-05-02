package com.yash.annotation.main;

import com.yash.annotation.pojo.DB_Driver;
import com.yash.annotation.pojo.NewDB_Driver;

public class DriverTest {

	public static void main(String[] args) {
		DB_Driver dbDriver=new NewDB_Driver();
		dbDriver.loadDriver();

	}

}
