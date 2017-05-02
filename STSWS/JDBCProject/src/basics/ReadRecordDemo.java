package basics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.log4j.Logger;
public class ReadRecordDemo {
	private static Logger logger=Logger.getLogger(ReadRecordDemo.class);
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
		logger.info("con : -"+con);
		//4. Create Statement and Execute query
		Statement stmt=con.createStatement();
		String sql="select * from contact";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			System.out.println(name+" -- "+phone);
		}
		logger.info(stmt);
		
		//5. close statement and close connection
		stmt.close();
		con.close();

	}

}
