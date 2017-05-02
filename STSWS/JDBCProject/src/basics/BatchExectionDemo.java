package basics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import org.apache.log4j.Logger;
public class BatchExectionDemo {
	private static Logger logger=Logger.getLogger(BatchExectionDemo.class);
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
		
		//4. Create query, create preparedStatement, Set placeholder value and execute()
		String sql="insert into contact(name,phone) values(?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, "John's");
		pstmt.setString(2, "7766558764");
		pstmt.addBatch();
		
		pstmt.setString(1, "Raj");
		pstmt.setString(2, "7766558798");
		pstmt.addBatch();
		
		pstmt.executeBatch();
		logger.info("record has been inserted successfully....check DB");
		//5. close statement and close connection
		pstmt.close();
		con.close();
	}
}
