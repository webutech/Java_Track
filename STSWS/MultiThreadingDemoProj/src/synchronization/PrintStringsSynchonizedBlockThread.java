package synchronization;

public class PrintStringsSynchonizedBlockThread implements Runnable {

	Thread thread;
	String str1, str2;
	TwoStringsSynchronizedBlock ts;

	
	public PrintStringsSynchonizedBlockThread(String str1, String str2, TwoStringsSynchronizedBlock ts) {
		this.str1 = str1;
		this.str2 = str2;
		this.ts = ts;
		thread=new Thread(this);
		thread.start();
	}


	@Override
	public void run() {
		synchronized (ts) {		
			ts.print(str1,str2);
		}

	}

}
