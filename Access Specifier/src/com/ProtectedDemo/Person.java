package com.ProtectedDemo;

public class Person { // we can create a outer class as protected but we can make use as inner class
	// like below is the example
	/*
	 * protected class A{
	 * 
	 * }
	 */
	// access variables, Method, constructor and Inner class

	protected int age;
	protected String name;

	protected Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	protected void display() {
		System.out.println(this.age);
		System.out.println(this.name);
	}

	// access protected properties in the same class
	//	public static void main(String[] args) {
	//		Person p = new Person(45, "Arun");
	//		p.display();

//}
}
