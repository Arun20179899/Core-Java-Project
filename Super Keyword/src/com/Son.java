package com;

public class Son extends Father {
	int age = 30; // member variable

	void wealth() {
		System.out.println("Son Property");
	}

	void display() {
		int age = 10; // local variable
		System.out.println(age); // dominate local variable
		System.out.println(this.age);// access member variable
		System.out.println(super.age);// access super class variable
		wealth();
		super.wealth();

	}
}
