package main.java.object;

public class ObjectExample { // 1 - Class name from where objects can be created or instantiated

	private String myField; // 2 - Field

	public ObjectExample() {}; // 3 - Default constructor

	public ObjectExample(String myField) { // 4 - Constructor with one parameter

		this.myField = myField;

	}

	public String getMyField() {

		return this.myField;

	}

	public boolean isFieldEqualToOtherField(String fieldToCompareWith) {

		String fieldLocal = this.myField;

		if (!fieldToCompareWith.equals(fieldLocal)) {

			return true;

		} else {

			return false;

		}

	}

	public static void main(String args[]) { // 5 - main method

		ObjectExample helloWorld = new ObjectExample("Test Success"); // 6 - Object creation or instantiation

		System.out.println("My Field value=" + helloWorld.myField);

	}

}
