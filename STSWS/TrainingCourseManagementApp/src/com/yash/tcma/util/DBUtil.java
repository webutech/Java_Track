package com.yash.tcma.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.yash.tcma.exception.ConnectionNotSetUpException;



/**
 * This DBUtil class will be able to connect with database and disconnect with database. 
 * @author sharma.pankaj
 *
 */
public class DBUtil {

	private static Connection con;
	private static Logger logger=Logger.getLogger(DBUtil.class);
	
	/**
	 * connection method will connect with the specified url.
	 * @return
	 * @throws ConnectionNotSetUpException
	 */
	public  static Connection connect() throws ConnectionNotSetUpException{
		Properties prop=new Properties();
		InputStream input=null;
		try{
			File file = new File("jdbc1.properties");
			FileInputStream fileInput = new FileInputStream(file);
		// load properties file
		prop.load(fileInput);
		// get the jdbc.properties file value
		String driverClassName=prop.getProperty("driverClassName");
		String url=prop.getProperty("url");
		String userName=prop.getProperty("userName");
		String password=prop.getProperty("password");
		logger.info(driverClassName);
		logger.info(url);
		logger.info(userName);
		logger.info(password);
		Class c=Class.forName(driverClassName);
		c.newInstance();
		logger.info(c);
		con=DriverManager.getConnection(url,userName,password);
		return con;
		}
		catch(Exception ex){
			throw new ConnectionNotSetUpException(ex.getMessage());
		}
	}
	
	
	public static void disconnect(){
		try{
		con.close();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	

}
