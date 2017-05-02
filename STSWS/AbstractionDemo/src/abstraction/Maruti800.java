package abstraction;

public class Maruti800 extends Car {
	
	
	@Override
	public void drive() {
		System.out.println("drive maruti with normal steering");

	}

	@Override
	public void stop() {
		System.out.println("stop maruti with normal break");

	}

}
