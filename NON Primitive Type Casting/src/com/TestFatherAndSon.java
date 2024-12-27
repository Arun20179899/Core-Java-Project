package com;

public class TestFatherAndSon {

	public static void main(String[] args) {
		System.out.println("------ To Achieve UP CASTING ------");
		Father f = new Son(); // Implicitly
		System.out.println("Age of father: " + f.age);
		f.workOfFather();
		// below is the sub class properties which we cannot access through up casting
		// System.out.println("Age of father: "+f.name);
		// f.workOfSon();
		System.out.println("------ To Achieve DOWN CASTING ------");
		Son s = (Son) f; // Explicitly
		// here we can access both super class property and subclass property
		System.out.println("Age of father: " + s.age);
		s.workOfFather();
		System.out.println("Name of Son: " + s.name);
		s.workOfSon();

	}

}
