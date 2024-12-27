package com;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value");// i want to take my first dynamic integer value
		int a = sc.nextInt(); // nextInt() is accept only dynamic integer number
		System.out.println("Enter the b value"); // i want to take my second dynamic integer value
		int b = sc.nextInt();
		System.out.println(a + b);// added both values
		sc.close(); // once after completing taking of dynamic value we should close the scanner
					// object with help of close method

	}

}
