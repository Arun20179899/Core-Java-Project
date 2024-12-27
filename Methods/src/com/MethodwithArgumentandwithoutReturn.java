package com;

public class MethodwithArgumentandwithoutReturn {

	void add(int a, int b) {
		System.out.println("sum of " + a + " & " + b + " is " + (a + b));
		/*
		 * int sum = a+b; System.out.println("sum of "+a+" & "+b+" is "+sum);
		 * System.out.println(a+b);
		 */
	}

	public static void main(String[] args) {
		MethodwithArgumentandwithoutReturn m1 = new MethodwithArgumentandwithoutReturn();
		m1.add(10, 20);
		m1.add(45, 67);
		m1.add(56, 89);

	}

}
