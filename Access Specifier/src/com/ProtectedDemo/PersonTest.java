package com.ProtectedDemo;

public class PersonTest {
	// access protected properties in the another class but same package
	// public static void main(String[] args) {
	// Person p = new Person(45, "Arun");
	// p.display();
	//
	// }

	protected int id = 567;
	protected double sallary = 459876.57;

	protected void toDisplay() {
		System.out.println("Access protected members in another class and another package");
	}
}
