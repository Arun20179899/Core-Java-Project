package org;

public class Cafe {
	Beverage vindingMachine(int choice){
		if(choice == 1) {
			return new Coffe();
		}
		else if(choice == 2) {
			return new Tea();
		}
		else {
			return null;
		}
		
	}
}
