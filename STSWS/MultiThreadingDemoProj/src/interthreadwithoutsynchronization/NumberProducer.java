package interthreadwithoutsynchronization;

public class NumberProducer extends Thread{
	
	private NumberProcessMachine numberProcessMachine;
	private int number;
	

	public NumberProducer(NumberProcessMachine numberProcessMachine, int number) {
		this.numberProcessMachine=numberProcessMachine;
		this.number=number;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			numberProcessMachine.put(i);
			 System.out.println("Producer #" + this.number
                     + " put: " + i);
			  try {
	                sleep((int)(Math.random() * 100));
	            } catch (InterruptedException e) { }
		}
		
	}

}
