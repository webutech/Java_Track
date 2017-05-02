package basics;

public class PrintNameThread extends Thread{
	public PrintNameThread(String name) {
		super(name);
		
	}
	
	// override the run method of the Thread class, this will be invoked when start method is called. 
	@Override
	public void run() {
		System.out.println("run() method of "+this.getName()+" thread is called");
		for(int i=0;i<10;i++){
			System.out.print(this.getName());
		}
	}

}
