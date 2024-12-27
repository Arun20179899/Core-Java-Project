package com;

public class Person { // public non abstract class

	private int age; // private data member

	// respective setter and getter method / data handler method
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {

		return age; // this.age -> we can make use of this, it is a good practice
	}

}
