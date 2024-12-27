package com;

public class Car {
	static int x;
	static{
		x=10;
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(x);

	}
	static{
		System.out.println(x);
	}
	{
		x=30;
	}
}
