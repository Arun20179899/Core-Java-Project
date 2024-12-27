package com;

public class PrintEvenNumbers {

	public static void main(String[] args) {
//		Print even or odd numbers from 1 to 100 by using combination on for loop and if
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is an even number");
			} else {
				System.out.println(i + " is an odd number");
			}
		}
		System.out.println("-----2nd Method-----");
		for (int i = 100; i >= 1; i--) {
			if (i % 2 == 1) {
				System.out.println(i + " it is an odd number");
			} else {
				System.out.println(i + " is an even number");
			}
		}
		System.out.println(99 % 2);

	}

}
