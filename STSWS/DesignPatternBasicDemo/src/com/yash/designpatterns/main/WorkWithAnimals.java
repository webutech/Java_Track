package com.yash.designpatterns.main;

import com.yash.designpatterns.pojo.Animal;
import com.yash.designpatterns.pojo.Cat;
import com.yash.designpatterns.pojo.Dog;

public class WorkWithAnimals {

	public static void main(String[] args) {
		Dog tommy=new Dog();
		tommy.setName("Tommy");
		tommy.attack();
		System.out.println(tommy.getName()+" sounds as : "+tommy.getSound());
		tommy.setWeight(-10);
		System.out.println(tommy.getName()+"'s weight is : "+tommy.getWeight());
		
		int randomWeight=10;
		System.out.println(tommy.getName()+"'s weight before weight change : "+randomWeight);
			
		tommy.changeWeight(randomWeight);
		
		System.out.println(tommy.getName()+"'s weight after weight change : "+randomWeight);
		
		// change dog name
		System.out.println("Dog's name before change name : "+tommy.getName());
		tommy.changeName(tommy);
		System.out.println("Dog's name after change name : "+tommy.getName());
		
		
		//polymorphism
		Animal doggy=new Dog();
		Animal kitty=new Cat();
		doggy.setName("Moti");
		kitty.setName("Billi");
		System.out.println(doggy.getName()+ " makes sound as : "+doggy.getSound());
		System.out.println(kitty.getName()+ " makes sound as : "+kitty.getSound());
		
	}

}
