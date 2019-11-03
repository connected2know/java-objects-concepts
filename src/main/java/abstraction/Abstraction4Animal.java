package main.java.abstraction;

public abstract class Abstraction4Animal { // 1 - abstract keyword being used in the definition of the class

	private String name;

	public Abstraction4Animal() {
	}

	public String getAnimalName() {

		return this.name;

	}

	public void setAnimalName(String newName) {

		this.name = newName;

	}

	public final String getAnimalCountry() { // 2 - method that controls the animal Country

		return "Canada";

	}

	public abstract String printBioInfo(); // 3 - Abstract method that must be implemented by all child classes

}
