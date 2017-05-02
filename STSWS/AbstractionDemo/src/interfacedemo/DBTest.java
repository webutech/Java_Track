package interfacedemo;

public class DBTest {

	public static void main(String[] args) {
		ConnectDB con=new MySQLDriver();
		con.connect();
		con.use();
		con.disConnect();
	}

}
