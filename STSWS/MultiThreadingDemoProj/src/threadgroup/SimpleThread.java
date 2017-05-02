package threadgroup;

public class SimpleThread extends Thread {
	public SimpleThread(String str) {
        super(str);
    }
    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.format("%d %s%n", i, this.getName());
            try {
                sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {}
        }
        System.out.format("DONE! %s%n", this.getName());
    }
}
