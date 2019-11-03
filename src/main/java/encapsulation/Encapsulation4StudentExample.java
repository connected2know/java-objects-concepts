package main.java.encapsulation;

public class Encapsulation4StudentExample {

	private Integer studentNumber; // 1 - class level variable declared as private

	public Encapsulation4StudentExample() {
	}

	public Integer getStudentNumber() {

		return this.studentNumber;

	}

	public void setStudentNumber(Integer newValue) { // 2 - class variable setter with conditional change behavior

		if (newValue > 0)

			this.studentNumber = newValue;

	}

}
