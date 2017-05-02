package com.yash.capp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This component will provide the JDBC related functionalities, like openConnection, closeConnection
 * createPreparedStatement, closePreparedStatement, closeResultSet.
 * It should be able to load driver as the object of this utility is created. 
 * @author sharma.pankaj
 *
 */
public class JDBCUtil {
	static final String URL="jdbc:mysql://localhost/contactappdb";
    static final String USER="root";
    static final String PASSWORD="root";
    private static final Logger logger=
			LoggerFactory.getLogger(JDBCUtil.class);
    // this block of code will execute once the object of JDBCUtil is created anywhere. 
    // this will be the block of code that will be executing before calling any of the functionality
    static{
    	try{
    		Class c=Class.forName("com.mysql.jdbc.Driver");
    		logger.info(c.toString());
    	}
    	catch(ClassNotFoundException ex){
    		ex.printStackTrace();
    	}
    }
    
    private Connection con;
    /**
     * openConnection() method will open the connection and return the connection objects
     */
    
    public Connection openConnection(){
    	try{
    		if(con==null){
    			con=DriverManager.getConnection(URL,USER,PASSWORD);
    		}
    		if(con.isClosed()){
    			con=DriverManager.getConnection(URL,USER,PASSWORD);
    		}
    	}
    	catch(SQLException ex){
    		ex.printStackTrace();
    	}
    	return con;
    }
	
	/**
	 * createPreparedStatement() will create the PreparedStatement object
	 */
    
    public PreparedStatement createPreparedStatement(String query){
    	try{
    		openConnection();
    		return con.prepareStatement(query);
    	}
    	catch(SQLException ex){
    		ex.printStackTrace();
    		throw new RuntimeException(ex);
    	}
    }
    
    public void closePreparedStatement(PreparedStatement pstmt){
    	if(pstmt!=null){
    		try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    
    public void closeConnection(){
    	try{
    		if(con!=null){
    			con.close();
    		}
    	}
    	catch(SQLException ex){
    		
    	}
    }
    
    public void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
        }
    }

}
