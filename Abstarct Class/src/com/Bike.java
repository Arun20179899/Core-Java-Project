package com;

public abstract class Bike extends Vehicle {
	Bike(double vehiclePrice) {
		super(vehiclePrice);

	}

	public abstract void stop();

	public void shiftGears() {
		System.out.println("Shift the gears");
	}
}
