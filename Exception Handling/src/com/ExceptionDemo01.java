package com;

import java.util.Scanner;

public class ExceptionDemo01 {

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
			System.out.println(a / b); // thrown object of ArithmeticException --->new ArithmeticException();
			System.out.println(num[size]); // thrown object of ArrayIndexOutOfBoundsException --> new
										// ArrayIndexOutOfBoundsException();
		} catch (ArithmeticException e) { // ArithmeticException e = new ArithmeticException();
			System.out.println("Invalid Denominator");
		} catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException e = new
														// ArrayIndexOutOfBoundsException();
			System.out.println("requested value not present in an array");
		}

		sc.close();
		System.out.println("End");
	}

}
