package interfacedemo;

public class MySQLDriver implements ConnectDB {

	@Override
	public void connect() {
		System.out.println("MySQL Connected....");
		
	}
	
	@Override
	public void use() {
		System.out.println("Data saved in MySQL");
		
	}
	
	@Override
	public void disConnect() {
		System.out.println("MySQL Disconnected...");
		
	}


}
