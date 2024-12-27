package com;

public class Demo {
	// Non-Parameterized Custom Constructor
	Demo() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		System.out.println("start");
		Demo d = new Demo();
		System.out.println("End");
	}

}
