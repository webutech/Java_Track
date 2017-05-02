package com.yash.tcma.test;

import java.sql.Connection;

import com.yash.tcma.exception.ConnectionNotSetUpException;
import com.yash.tcma.util.DBUtil;

public class DBUtilTest {

	public static void main(String[] args) {
		Connection con;
		try {
			con=DBUtil.connect();
			System.out.println("connection : "+con);
		} catch (ConnectionNotSetUpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
