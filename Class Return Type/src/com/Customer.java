package com;

public class Customer {
	public static void main(String[] args) {
		Hotel h = new Hotel();
		Food obj = h.order(4);
		if (obj instanceof Idly) {
			System.out.println("order idly");
		} else if (obj instanceof Dosa) {
			System.out.println("Ordered Dosa");
		} else if (obj instanceof Vada) {
			System.out.println("Ordered Vada");

		} else {
			System.out.println("order is Invalid");
		}
	}
}
