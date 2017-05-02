package com.yash.main;

import com.yash.pojo.Animal;
import com.yash.pojo.Dog;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog=new Dog();   // Dog IS-A Animal
		dog.run();
		dog.eat();
		
		//Rule : 
		//1. methods will be called on reference type.  - compilation rule
		//2. methods will be called on object type at run time - JVM Rule
		dog.bark();
		

	}

}
