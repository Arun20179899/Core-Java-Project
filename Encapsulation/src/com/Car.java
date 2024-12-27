package com;

public class Car {

	private int cost;

	// initialization based on some checks could be achieved through constructor
	// too,
	// but what if we you want modify

	public Car(int cost) {
		if (cost > 0) {
			this.cost = cost;
		}
	}

	public int getCoat() {
		return this.cost;
	}

	public void setCost(int cost) {
		if (cost > 0) {
			this.cost = cost;
		}
	}
}
