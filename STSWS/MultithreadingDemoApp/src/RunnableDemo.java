class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		task(Thread.currentThread().getName());
		
	}

	private void task(String threadName) {
		for (int i = 0; i < 10; i++) {
			
			System.out.println(threadName+":"+i);
			
		}
	}
}
public class RunnableDemo {

	public static void main(String[] args) {
		MyThread2 target=new MyThread2();
		Thread t1=new Thread(target);
		Thread t2=new Thread(target);
		t1.setName("Anchit");
		t2.setName("Nimisha");
		t1.start();
		t2.start();
		//t1.start();

	}

}
