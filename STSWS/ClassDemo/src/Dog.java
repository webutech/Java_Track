
public class Dog {
	
	private String name;
	private int age;
	
	public Dog() {
		name="Unknown";
		age=0;
	}
	
	public Dog(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		
		return name+","+age;
	}
	
	
	
	

}
