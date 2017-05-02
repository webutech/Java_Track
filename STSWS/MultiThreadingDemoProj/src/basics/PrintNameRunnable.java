package basics;

public class PrintNameRunnable implements Runnable{
	//private String name;
	Thread thread;
	public PrintNameRunnable(String name) {
		thread=new Thread(this,name);
		thread.start();
		
	}

	@Override
	public void run() {
		String name=thread.getName();
		System.out.println("run() method of "+name+" thread is called");
		for(int i=0;i<=10;i++){
			System.out.print(name);
		}
		
	}
	
	
}
