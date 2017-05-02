class MyThread extends Thread{
	
	@Override
	public void run() {
		// attach user defined task
		String threadName=Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(threadName+": "+i);
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.setName("Anchit");
		t2.setName("Nimisha");
		//t1.setPriority(10);
	
		t1.start();
		t2.start();
		
	}

}
