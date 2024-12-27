package com;

import java.util.Scanner;

public class SwitchAdavance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Hi Dinga");
				break;
			case 2:
				System.out.println("Hi Dingi");
				break;
			case 3:
				System.out.println("Thank You!!!");
				System.exit(0); // 0 indicates programmer wants to terminate the switch
				break;
			default:
				System.out.println("Invaloid choice");
			}
		}

	}

}
