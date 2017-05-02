package basics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.apache.log4j.Logger;
public class InsertDemo {
	private static Logger logger=Logger.getLogger(InsertDemo.class);
	public static void main(String[] args) {
		try{
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
		logger.info("con : -"+con);
		//4. Create Statement and Execute query
		Statement stmt=con.createStatement();
		String sql="insert into contact(name,phone) values('guru','778761875')";
		stmt.executeUpdate(sql);
		logger.info(stmt);
		logger.info("record has been inserted successfully....check DB");
		//5. close statement and close connection
		stmt.close();
		con.close();
		}
		catch(Exception ex){
			logger.debug("Driver is not registered : check your classpath : "+ex.getMessage());
		}

	}

}
