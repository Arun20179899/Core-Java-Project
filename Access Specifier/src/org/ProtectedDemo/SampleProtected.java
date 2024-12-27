package org.ProtectedDemo;

import com.ProtectedDemo.Person;

public class SampleProtected extends Person {
	// if you access parent protected constructor through child class
	// you should create child protected constructor
	protected SampleProtected(int age, String name) {
		super(age, name);

	}

	public static void main(String[] args) {
		SampleProtected sp = new SampleProtected(78, "Arun");
		sp.display();
	}

}
