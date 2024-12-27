package com;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
//		Create a add method with argument and with return type and passed the dynamic value for 5times
		Demo3 d1 = new Demo3();
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i<=5;i++) {
			System.out.println("Enter the value of a");
			int a = sc.nextInt();
			System.out.println("Enter the value of b");
			int b = sc.nextInt();
			int returnvalue = d1.add(a, b);
			System.out.println("Sum of "+a+" & "+b+" is "+returnvalue);
			System.out.println("------------------------");
		}
		sc.close();
		
	}

	int add(int a, int b) {
		return a + b;
	}

}
