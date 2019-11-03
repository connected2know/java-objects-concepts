package main.java.polymorphism;

import main.java.ihneritance.Inheritance4Animal;
import main.java.ihneritance.Inheritance4Dog;

public class PolymorphismExample {

	public static void main(String[] args) {

		Inheritance4Dog dog = new Inheritance4Dog(); 	// 1 - we instantiate a Dog object and we set the name. After that
														// we simple print the name.    

		dog.setAnimalName("Rufus");

		System.out.println(dog.getAnimalName());

		Inheritance4Animal dog2 = new Inheritance4Dog(); 	// 2 - we instantiate a Dog object and we set the name. After
															// that we simple print the name.  

		dog2.setAnimalName("Ted");

		System.out.println(dog2.getAnimalName());

	}

}
