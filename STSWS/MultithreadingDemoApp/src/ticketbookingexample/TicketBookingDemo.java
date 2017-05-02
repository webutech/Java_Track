package ticketbookingexample;

class MovieService implements Runnable{
	private static int available=1;
	@Override
	public void run() {
		Thread ct=Thread.currentThread();
		String name=ct.getName();
		// assign the task which is supposed to be executed by threads. 
		booking(name);
			
		
	}
	
	private void booking(String name) {
		System.out.println("Availability check by = "+name+" : "+available);
		
		synchronized (this) {
			
		
			// logic for ticket booking
			if(available>=1){
				System.out.println("Booking started for "+name);
				available=available-1;
				System.out.println("Booking Completed for "+name);
				
			}		
			else{
				System.out.println("No ticket available for "+name);
			}
				
		}
			
	}
	
}
public class TicketBookingDemo {

	public static void main(String[] args) {
		MovieService tar=new MovieService();
		Thread t1=new Thread(tar);
		Thread t2=new Thread(tar);
		t1.setName("Anchit");
		t2.setName("Nimisha");
		t1.start();
		t2.start();
				//t1.start(); : this will throw IllegalThreadStateException

	}

}
