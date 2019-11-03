package main.java.ihneritance;

public class Inheritance4Animal { // 1 – top-level class creation, this can be a superclass of others

	private String name;

	public Inheritance4Animal() {
	}

	public String getAnimalName() { // 2 – method to get the animal name

		return this.name;

	}

	public void setAnimalName(String newName) { // 3 – method to change the animal name

		this.name = newName;

	}

}
