package interfacedemo;

public class OracleDriver implements ConnectDB {

	@Override
	public void connect() {
		System.out.println("Oralce Connected...");

	}

	@Override
	public void use() {
		System.out.println("Data Saved in Oracle....");

	}

	@Override
	public void disConnect() {
		System.out.println("Oracle Disconnected....");

	}

}
