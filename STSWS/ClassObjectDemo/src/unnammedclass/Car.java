package unnammedclass;

public abstract class Car {
	
	public Car(){
		drive();
		fillTank();
		stop();
	}
	
	public abstract void drive();
	public abstract void stop();
	public void fillTank(){
		System.out.println("Fulling tank....");
	}

}
