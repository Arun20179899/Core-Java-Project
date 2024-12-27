package com;

public class Car {
	static int cost = 10;

	public static void main(String[] args) {
		System.out.println(cost);// Car.cost
		cost = 20; // Car.cost -> IMP- static variable can be re initialized
		System.out.println(cost);// Car.cost
		System.out.println("___________________________________");
		Car c1 = new Car();
		System.out.println(c1.cost); // but not a good practice

	}

}
