
public class Dog {
	//Instance variables
	private int age;
	private String name;
	//Methods, behaviours
	
	
	
	public void eat(){
		System.out.println(name +" is eating : "+age);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=0)
		this.age = age;
		else
			throw new RuntimeException("Age can not be negative");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void run(){
		System.out.println(name +" is running : "+age);
	}

}
