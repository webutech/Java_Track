package abstraction;

public abstract class Car {
	
	
	public Car() {
		// sequence
		drive();
		fillTank();
		stop();
	}
	public abstract void drive();
	public abstract void stop();
	public void fillTank(){
		System.out.println("Fueling Car....");
	}

}
