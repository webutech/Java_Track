package threadgroup;

public class SimpleThreadForAllThreads extends Thread {
	
	 public SimpleThreadForAllThreads(String str) {
	        super(str);
	    }
	    
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            // System.out.format("%d %s%n", i, getName());
	            try {
	                sleep((long)(Math.random() * 1000));
	            } catch (InterruptedException e) {}
	        }
	        System.out.format("DONE! %s%n", getName());
	    }

}
