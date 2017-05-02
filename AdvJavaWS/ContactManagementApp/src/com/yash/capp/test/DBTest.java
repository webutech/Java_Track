package com.yash.capp.test;

import java.sql.Connection;

import com.yash.capp.db.JDBCUtil;

public class DBTest {

	public static void main(String[] args) {
		JDBCUtil jdbcUtil=new JDBCUtil();
		Connection con=jdbcUtil.openConnection();
		System.out.println(con);

	}

}
