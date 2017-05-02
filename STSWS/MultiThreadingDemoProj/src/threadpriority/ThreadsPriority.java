package threadpriority;

public class ThreadsPriority {

	public static void main(String[] args) {
		Thread t1=new SimpleThread("Yash Indore");
		t1.start();
		// set the thread priority to highest
		t1.setPriority(10);
		
		Thread t2=new SimpleThread("Yash Pune");
		t2.start();
		// set the thread priority to highest
		t2.setPriority(5);
		
		Thread t3=new SimpleThread("Yash US");
		t3.start();
		// set the thread priority to highest
		t3.setPriority(1);
	}

}
