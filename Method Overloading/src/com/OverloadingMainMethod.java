package com;

public class OverloadingMainMethod {

	public static void main(String[] args) {
		System.out.println("Hello");
		main(10);
		main(45.36);
		main("Jeery", 78.36);
		main(67.34, "tom");

	}

	public static void main(int x) {
		System.out.println("value of x: " + x);

	}

	public static void main(double y) {
		System.out.println("value of y: " + y);
	}

	public static void main(String x, double y) {
		System.out.println("value of x: " + x + " & value of y: " + y);

	}

	public static void main(double x, String y) {
		System.out.println("value of x: " + x + " & value of y: " + y);

	}

}
