package markerinterfacedemo;

public class Tester implements Employee {

	String name;
	
	public Tester(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void doSomething() {
		System.out.println(getName()+ " :  is Testing");
		
	}

}
