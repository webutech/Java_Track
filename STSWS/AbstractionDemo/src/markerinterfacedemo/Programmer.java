package markerinterfacedemo;

public class Programmer implements Employee, Expert{
	
	String name;
	
	public Programmer(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void doSomething() {
		System.out.println(getName()+ " :  is programming");
		
	}

	
}
