package com;

public class Car {
	int cost;
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.cost); //0
		c1.cost = 15;
		System.out.println(c1.cost); // 15
		Car c2 = new Car();
		System.out.println(c2.cost); //0
		c2.cost = 45;
		System.out.println(c2.cost); //45
	}

}
