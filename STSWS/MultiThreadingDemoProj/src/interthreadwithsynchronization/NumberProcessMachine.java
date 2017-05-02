package interthreadwithsynchronization;

//Unsynchronized NumberProcessMachine.
//
//Results are unpredictable; a number may be read before a number has 
//been produced or multiple numbers may be produced with only one or 
//two being read adding synchronization ensures that a number is first 
//produced, then read in the correct order
public class NumberProcessMachine {
	private int contents;
	private boolean available = false;

	public synchronized int get(int who) {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		System.out.format("Consumer %d got: %d%n", who, contents);
		notifyAll();
		return contents;
	}

	 public synchronized void put(int who, int value) {
	        while (available == true) {
	            try {
	                wait();
	            } catch (InterruptedException e) { }
	        }
	        contents = value;
	        available = true;
	        System.out.format("Producer %d put: %d%n", who, contents);
	        notifyAll();
	    }
}
