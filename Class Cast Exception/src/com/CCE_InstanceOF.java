package com;

public class CCE_InstanceOF {

	public static void main(String[] args) {
		Vehicle obj; // Declaration
		obj = new Car(); // initialization

		if (obj instanceof Bike) {
			Bike b = (Bike) obj;
			System.out.println(b.name+"\t"+b.cost);
		} else if (obj instanceof Car) {
			Car c = (Car) obj;
			System.out.println(c.name+"\t"+c.fuel);
		}

	}

}
