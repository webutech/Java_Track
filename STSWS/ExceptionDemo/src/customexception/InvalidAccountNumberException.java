package customexception;

public class InvalidAccountNumberException extends Exception{
	
	 public InvalidAccountNumberException(String errMsg){
		 super(errMsg);
	 }

}
