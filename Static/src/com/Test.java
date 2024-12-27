package com;

public class Test {
	// accessing the static properties with in the same class
	static int x = 10;

	static void display() {
		System.out.println("learning Java");
	}

	public static void main(String[] args) {
		System.out.println(Test.x);
		Test.display();
		// Also we can access the static variable and method without using the class name but
		// internally it will considered as class name
		System.out.println(x); // class name.variable name -> Test.x
		display(); // class name.method name -> Test.display
	}

}
