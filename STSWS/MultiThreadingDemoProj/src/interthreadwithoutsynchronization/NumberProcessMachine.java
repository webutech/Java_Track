package interthreadwithoutsynchronization;

//Unsynchronized NumberProcessMachine.
//
//Results are unpredictable; a number may be read before a number has 
//been produced or multiple numbers may be produced with only one or 
//two being read adding synchronization ensures that a number is first 
//produced, then read in the correct order
public class NumberProcessMachine {
	private int contents;
	private boolean available=false;
	public int get(){
		available=false;
		return contents;
	}
	 public void put(int value) {
	        contents = value;
	        available = true;
	    }
}
