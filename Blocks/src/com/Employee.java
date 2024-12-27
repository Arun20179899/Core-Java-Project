package com;

public class Employee {
	static int x;
	static {
		x=20;
	}
	public static void main(String[] args) {
		System.out.println(Employee.x);// x

	}
	static {
		x=30;
	}
}
//x -> 0 -> 20 -> 30
