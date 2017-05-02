package basics;

public class RunnableThreadTest1 {
	public static void main(String[] args) {
		PrintNameRunnable pnr1=new PrintNameRunnable("A");
		Thread tr1=new Thread(pnr1);
		tr1.start();		
	}
}
