package threadmethods;

class StartEnd{
	public void displayStartBracketsWithMessage(String message){
		System.out.print("["+message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.print("]");
		
	}
}

class CreateMessage extends Thread{
	
	String message;
	StartEnd startEnd;
	public CreateMessage(StartEnd startEnd, String message) {
		this.startEnd=startEnd;
		this.message=message;
		start();
		try {
			join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		synchronized (startEnd) {
			startEnd.displayStartBracketsWithMessage(message);
		}
		
	}
	
}
public class SynchonizationDemo {

	public static void main(String[] args) {
		StartEnd startEnd=new StartEnd();
		CreateMessage t1=new CreateMessage(startEnd, "Welcome");
		CreateMessage t2=new CreateMessage(startEnd, "In");
		CreateMessage t3=new CreateMessage(startEnd, "Thread");
		CreateMessage t4=new CreateMessage(startEnd, "Programming");
		
		

	}

}
