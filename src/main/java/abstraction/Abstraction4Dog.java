package main.java.abstraction;

public class Abstraction4Dog extends Abstraction4Animal { // 4 - Subclass Dog of parent superclass Animal. This is
															// called a concrete class

	public Abstraction4Dog() {

		super();

	}

	@Override
	public String printBioInfo() { // 5 - Overriding of abstract parent method 

		String countryOfAnimal = getAnimalCountry(); 	// call to the parent method getAnimalCountry and assign the result
														// into a local variable

		System.out.println("Hello I'm a Dog from " + countryOfAnimal);
		return countryOfAnimal;

	}

	public static void main(String[] args) {

		Abstraction4Dog dog = new Abstraction4Dog(); // 6 - Instantiation of an object dog

		dog.printBioInfo(); // 7 - Call of overriden method.

	}

}
