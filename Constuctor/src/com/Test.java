package com;

public class Test {
	// Parameterized Custom Constructor
	Test(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("start");
		Test t = new Test(5);
		System.out.println("End");
	}

}
