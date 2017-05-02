class Animal{
	public void eat(){
		System.out.println("Animal is eating from mouth");
	}
	
	public void run(){
		System.out.println("Animal is running");
	}
}

class Dog extends Animal{
	
}

class Monkey extends Animal{
	
	public void eat(){
		System.out.println("Moneky is eating like human");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Animal animals[]={new Dog(), new Monkey(),new Monkey(),new Monkey(), new Dog()};
		for (Animal animal : animals) {
			if(animal instanceof Monkey){
			Monkey monkey=(Monkey)animal;
			monkey.eat();
			monkey.run();
			}
			
		}
	}

}
