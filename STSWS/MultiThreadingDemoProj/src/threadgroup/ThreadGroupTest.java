package threadgroup;

public class ThreadGroupTest {
	
	public static void main(String[] args) {
		// start three new threads and start them, they should all belong to the same thread group
		new SimpleThread("Yash Indore").start();
		new SimpleThread("Yash Pune").start();
		new SimpleThread("Yash US").start();
		
		// get threadgroup of the current thread and display the number of active thread that belong the threadgroup
		ThreadGroup group=Thread.currentThread().getThreadGroup();
		System.out.println("number of active threads in this thread group : "+group.activeCount());
		
		// Display the name of the threads in the current thread group
		Thread[] threadList=new Thread[10];
		int actualSize=group.enumerate(threadList);
		
		
		for (int i = 0; i < actualSize; i++) {
			System.out.println("Thread : "+threadList[i].getName()+" in thread group "+group.getName());			
		}
	}
}
