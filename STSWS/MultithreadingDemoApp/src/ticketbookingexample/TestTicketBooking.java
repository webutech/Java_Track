package ticketbookingexample;

public class TestTicketBooking {

	public static void main(String[] args) {
		TicketBookingServiceImpl target=new TicketBookingServiceImpl();
		Thread t1=new Thread(target);
		Thread t2=new Thread(target);
		t1.setName("Anchit");
		t2.setName("Nimisha");
		t1.start();
		t2.start();
		

	}

}
