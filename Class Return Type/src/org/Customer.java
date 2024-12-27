package org;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		Cafe c = new Cafe();
		Scanner sc = new Scanner(System.in);
		System.out.println("1:Coffee\n2:Tea");
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		Beverage obj = c.vindingMachine(choice);
		if (obj instanceof Coffe) {
			System.out.println("Drinking Coffe");
		} else if (obj instanceof Tea) {
			System.out.println("Drinking Tea");
		} else {
			System.out.println("Invalid");
		}
		sc.close();

	}
}
