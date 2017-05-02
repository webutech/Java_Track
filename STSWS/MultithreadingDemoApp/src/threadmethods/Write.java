package threadmethods;

class Pen{
	
}

class Paper{
	
}
public class Write {

	public static void main(String[] args) {
		final Pen pen=new Pen();
		final Paper paper=new Paper();
		
		Thread t1=new Thread(){
			@Override
			public void run() {
				synchronized (pen) {
					System.out.println(Thread.currentThread().getName()+" is holding pen");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
					}
					synchronized (paper) {
						System.out.println(Thread.currentThread().getName()+" is requesting for paper");
					}
				}
			}
			
		};
		
		Thread t2=new Thread(){
			@Override
			public void run() {
				synchronized (paper) {
					System.out.println(Thread.currentThread().getName()+" is holding Paper");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
					}
					synchronized (pen) {
						System.out.println(Thread.currentThread().getName()+" is requesting for Pen");
					}
				}
			}
			
		};
		
		t1.setName("Anchit");
		t2.setName("Nimisha");
		t1.start();
		t2.start();
	}

}
