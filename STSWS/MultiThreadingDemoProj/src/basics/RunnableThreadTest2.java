package basics;

public class RunnableThreadTest2 {

	public static void main(String[] args) {
		PrintNameRunnable pnr1=new PrintNameRunnable("A");
		Thread tr1=new Thread(pnr1);
		tr1.start();
		
		PrintNameRunnable pnr2=new PrintNameRunnable("B");
		Thread tr2=new Thread(pnr2);
		tr2.start();
		
		PrintNameRunnable pnr3=new PrintNameRunnable("C");
		Thread tr3=new Thread(pnr3);
		tr3.start();
		
		
		
	}

}
