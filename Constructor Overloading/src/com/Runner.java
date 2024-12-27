package com;

public class Runner {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("BMW");
		Vehicle v2 = new Vehicle("Petrol", 1500000);
		new Vehicle(25000000, "Audi");// we can create object this way also, but its address is not referring any
		// reference variable
		new Vehicle("Benz", "Diesel");
		new Vehicle();

	}

}
