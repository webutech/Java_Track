package threadmethods;

class JoinThread implements Runnable{

	@Override
	public void run() {
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName + "*******Starting*******");
		
		for (int i = 0; i < 10; i++) {
			
			
			System.out.println("<"+threadName+"> : "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		System.out.println(threadName + "*******Ending*******");
		
	}
	
}
public class JoinDemo {

	public static void main(String[] args) {
		JoinThread target=new JoinThread();
		Thread t1=new Thread(target);
		Thread t2=new Thread(target);
		Thread t3=new Thread(target);
		
		t1.setName("Pankaj");
		t2.setName("Rajeev");
		
		t1.start();
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();		
	}
}
