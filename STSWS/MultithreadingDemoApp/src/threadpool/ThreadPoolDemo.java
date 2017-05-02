package threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{

	private String message;
	
	public WorkerThread(String message) {
		this.message=message;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(start) message : "+message);
		processMessage();
		System.out.println(Thread.currentThread().getName()+"(End) message : "+message);
		
		
	}
	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker=new WorkerThread(""+i);
			executor.execute(worker);
			
			
		}

		executor.shutdown();
		while (!executor.isTerminated()) {
			
			
		}
		
		System.out.println("All Thread completed");
		
	}

}
