/**
 * If user is Admin user then only let him enter in the system, and show Welcome :  Admin 
 * else show that you are blocked to enter in the system
 * @author sharma.pankaj
 *
 */
public class ThrowDemo {
	
	public static void userAuthentication() throws RuntimeException{
		String userRole="Manager";
		if(userRole.equals("Admin")){
			System.out.println("Welcome  : "+userRole);
		}
		else{
			throw new RuntimeException("You are blocked to enter in system");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("-------------First Line----------------");
		try{
			userAuthentication();
		}
		catch(RuntimeException ex){
			System.out.println("Error : "+ex.getMessage());
		}
		System.out.println("-------------First Line----------------");
	}

}
