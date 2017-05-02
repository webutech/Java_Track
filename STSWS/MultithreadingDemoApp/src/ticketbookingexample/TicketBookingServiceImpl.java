package ticketbookingexample;

public class TicketBookingServiceImpl implements Runnable {
	
	private int availableTicket=1;
	
	private void BookTicket(String name){
		System.out.println("Ticket Availablity check by : "+name);
		System.out.println("Available Ticket : "+availableTicket);
		System.out.println("Booking Started for : "+name);
		synchronized (name) {
			availableTicket=availableTicket-1;
		}
		
		System.out.println("Booking Completed for : "+name);
	}

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		BookTicket(name);
		
	}
	

}

