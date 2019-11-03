package main.java.ihneritance;

public class Inheritance4Dog extends Inheritance4Animal { 	// 4 – class that extends another one. This type of class is
															// called “subclass of”. In this example, Dog is subclass of
															// Animal

	public Inheritance4Dog() {

		super(); // 5 – calling the superclass constructor

	}

	public static void main(String[] args) { 	// 6 – we instantiate a Dog object and we set the name. After that, we
												// simple print the name.

		Inheritance4Dog dog = new Inheritance4Dog();

		dog.setAnimalName("Rufus");

		System.out.println(dog.getAnimalName());

	}

}
