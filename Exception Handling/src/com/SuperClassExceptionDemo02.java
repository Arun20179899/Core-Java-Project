package com;

import java.util.Scanner;

public class SuperClassExceptionDemo02 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a:");
		int a = sc.nextInt();

		System.out.println("Enter the value of b:");
		int b = sc.nextInt();

		System.out.println("Enter the position value of the array");
		int size = sc.nextInt();

//		System.out.println(a / b);

		int[] num = { 10, 30, 50 };
//		System.out.println(num[size]);

		try {

			System.out.println(a / b);
			System.out.println(num[size]);

		}

		catch (ArithmeticException e) {
			System.out.println("Invalid Denominator");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("requested value not present in an array");
		} 
		
		catch (Exception e) {
			System.out.println("Invalid Denominator");
			System.out.println("requested value not present in an array");
		}

		sc.close();
		System.out.println("End");

	}

}
