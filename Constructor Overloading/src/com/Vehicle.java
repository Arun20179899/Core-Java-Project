package com;

public class Vehicle {
	// To avoid redundancy and constructor overloading
	// String brand;
	// String fuel;
	// int cost;

	Vehicle(String brand) {
		// this.brand = brand;
		System.out.println("brand is: " + brand);
	}

	Vehicle(String fuel, int cost) {
		// this.fuel = fuel;
		// this.cost = cost;
		System.out.println("fuel is: " + fuel + " cost is:" + cost);

	}

	Vehicle(int cost, String fuel) {
		// this.cost = cost;
		// this.fuel = fuel;
		System.out.println("cost is:" + cost + " fuel is: " + fuel);

	}

	Vehicle(String brand, String fuel) {
		// this.brand = brand;
		// this.fuel = fuel;
		System.out.println("cost is:" + brand + " cost is:" + fuel);

	}

	// we can use empty constructor also inside the constructor overloading but it
	// accepts rules
	Vehicle() {
		System.out.println("Intializing empty constructor");
	}
	// below is only uses when all the parameters are explicitly define if not it is
	// printed default value
	/*
	 void todisplay() { 
	 System.out.println(this.brand);
	 System.out.println(this.fuel); 
	 System.out.println(this.cost); 
	 }
	 */

}
