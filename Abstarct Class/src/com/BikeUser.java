package com;

public class BikeUser extends Bike{
	BikeUser(double vehiclePrice) {
		super(vehiclePrice);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void stop() {
		System.out.println("bike Stopped!!!");
	}
	public void start() {
		System.out.println("Bike Started");
	}

	
	public static void main(String[] args) {
		
		BikeUser bu = new BikeUser(450000);
		bu.start();
		bu.shiftGears();
		bu.stop();

	}

}
