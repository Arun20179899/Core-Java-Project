package com;

public class ForLoopDemo {

	public static void main(String[] args) {
//		print "hello" in 5 times

		/*
		 * System.out.println("Hello"); System.out.println("Hello");
		 * System.out.println("Hello"); System.out.println("Hello");
		 * System.out.println("Hello");
		 */

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " Hello World");
		}
		System.out.println("print values from 1 to 5");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("print values from 5 to 1");
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("Print Even numbers from 1 to 10");
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("print odd number from 1 to 10");
		for (int i = 1; i < +10; i = i + 2) {
			System.out.println(i);

		}
		System.out.println("print even number from 150 to 141");
		for (int i = 150; i >= 141; i--, i--) {
			System.out.println(i);
		}
		System.out.println("print odd number from 99 to 46");
		for (int i = 99; i >= 46; i -= 2) {
			System.out.println(i);
		}

	}

}
