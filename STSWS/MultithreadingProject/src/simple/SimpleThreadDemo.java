package simple;

class Mythread extends Thread {

	@Override
	public void run() {
		String threadName=Thread.currentThread().getName();
		System.out.println("-------"+threadName+" Started ----------");
		// task for execution ...attach task
		for(int i=1;i<=5;i++){
			System.out.println("<"+threadName+"> :::"+i);
		}
		System.out.println("-------"+threadName+" Ended ----------");
	}

}

public class SimpleThreadDemo {

	public static void main(String[] args) {
		Mythread thread1=new Mythread();
		Mythread thread2=new Mythread();
		Mythread thread3=new Mythread();
		thread1.setName("Vishakha");
		thread2.setName("Rajat");
		thread3.setName("Sawan");
		thread1.start();
		thread2.start();
		thread3.start();
		thread1.start();
		
	}

}
