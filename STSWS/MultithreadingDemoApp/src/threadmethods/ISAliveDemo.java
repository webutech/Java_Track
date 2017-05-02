package threadmethods;

class MyThread implements Runnable{

	@Override
	public void run() {
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName + "*******Starting*******");
		
		for (int i = 0; i < 10; i++) {
			
			if(i==5){
				Thread.currentThread().yield();
			}
			else{
			System.out.println("<"+threadName+"> : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
		}
		
		System.out.println(threadName + "*******Ending*******");
		
	}
	
}
public class ISAliveDemo {

	public static void main(String[] args) {
		MyThread target=new MyThread();
		Thread t1=new Thread(target);
		Thread t2=new Thread(target);
		Thread t3=new Thread(target);
		
		t1.setName("Pankaj");
		t2.setName("Rajeev");
		t3.setName("Aman");
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
