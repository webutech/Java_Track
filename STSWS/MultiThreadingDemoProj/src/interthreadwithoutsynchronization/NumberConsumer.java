package interthreadwithoutsynchronization;

public class NumberConsumer extends Thread {

	private NumberProcessMachine numberProcessMachine;
	private int number;

	public NumberConsumer(NumberProcessMachine numberProcessMachine, int number) {
		this.numberProcessMachine = numberProcessMachine;
		this.number = number;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = numberProcessMachine.get();
			System.out.println("Consumer #" + this.number + " got: " + value);
		}

	}
}
