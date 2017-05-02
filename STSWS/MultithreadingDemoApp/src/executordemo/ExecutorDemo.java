package executordemo;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

class SequentialExecutor implements Executor{
	
	final Queue<Runnable> queue=new ArrayDeque<>();
	
	Runnable task;
	

	@Override
	synchronized public void execute(final Runnable r) {
		queue.offer(new Runnable() {
			
			@Override
			public void run() {
				try{
				r.run();
				}
				finally{
					next();
				}
			}
		});	
		
		if(task==null){
			next();
		}
		
	}
	private void next() {
		if((task=queue.poll())!=null){
			new Thread(task).start();
		}
		
	}
	
}

class SimpleRunnableThread implements Runnable{
	String threadName=null;
	
	
	public SimpleRunnableThread(String threadName) {
		this.threadName = threadName;
	}


	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(threadName+" : "+i);
		}
		
	}
}
public class ExecutorDemo {

	public static void main(String[] args) {
		SimpleRunnableThread t1=new SimpleRunnableThread("One");
		SimpleRunnableThread t2=new SimpleRunnableThread("Two");
		Executor executor=new SequentialExecutor();
		executor.execute(t1);
		executor.execute(t2);
	}

}
