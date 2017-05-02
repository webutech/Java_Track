package basics;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import org.apache.log4j.Logger;
public class DataBaseMetaDataDemo {
	private static Logger logger=Logger.getLogger(DataBaseMetaDataDemo.class);
	public static void main(String[] args) throws Exception {
		
		// 1. Gather DB information
		// refer mysql mannual for Driver and url
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost/mydb";
		String user="root";
		String pwd="root";
		
		//2. Load Driver or Register Driver
		Class c=Class.forName(driverClassName);
		c.newInstance(); // create object of loaded driver class, uses default constructor
		logger.info("class : - "+c);
		//3. Create Connection object
		Connection con=DriverManager.getConnection(url,user,pwd);
		
		// 4. DataBase MetaData information		
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println("Vendor name : "+dbmd.getDatabaseProductName());
		System.out.println("Version : "+dbmd.getDatabaseMajorVersion());
		System.out.println("Driver : "+dbmd.getDriverName());
		System.out.println("url : "+dbmd.getURL());
		System.out.println("username : "+dbmd.getUserName());	
		
		//5. close statement and close connection
		
		con.close();

	}

}
