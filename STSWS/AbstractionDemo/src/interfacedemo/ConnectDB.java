package interfacedemo;

/**
 * This is a design for connecting any database. 
 * Database vendor have to provide the implementation of available methods. 
 * @author sharma.pankaj
 *
 */

public interface ConnectDB {
	/**
	 * Provide the connection code for the DB
	 */
	public void connect();
	/**
	 * Provide the code for transaction in DB
	 */
	public void use();
	/**
	 * Provide the code to disconnect from DB
	 */
	public void disConnect();

}
