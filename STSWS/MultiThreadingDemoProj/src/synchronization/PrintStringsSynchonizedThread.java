package synchronization;

public class PrintStringsSynchonizedThread implements Runnable {

	Thread thread;
	String str1, str2;

	public PrintStringsSynchonizedThread(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();

	}

	@Override
	public void run() {
		TwoStringsSynchnonize.print(str1,str2);
	}

}
