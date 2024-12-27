package com;

public class TestCar {
	public static void main(String[] args) {
		Car c = new Car(100);
		System.out.println("cost: "+c.getCoat());
		
		// i want increase the cost of the car without initialize another object
		// we will achieve this through setter method
		c.setCost(200);
		
		System.out.println("cost: "+c.getCoat());
		
		c.setCost(300);
		
		System.out.println("cost: "+c.getCoat());
		
		
	}
}
