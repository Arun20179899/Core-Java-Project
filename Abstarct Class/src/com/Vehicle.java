package com;

public abstract class Vehicle {
	private String vehicleName = "BMW";
	abstract void start();
	Vehicle(double vehiclePrice){
		System.out.println("Price of "+vehicleName+" is "+vehiclePrice);
		
	}
}
