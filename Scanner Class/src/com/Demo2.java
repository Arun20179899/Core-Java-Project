package com;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// print the employee Age, Name and Salary by providing the dynamic value to
		// system input
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <=3; i++) {
			System.out.println("Enter the Employee Age");
			int age = sc.nextInt();
			System.out.println("Enter the Employee Name");
			String name = sc.next();
			System.out.println("Enter the Employee Salary");
			double salary = sc.nextDouble();
			System.out.println("Employee Age is: " + age + "\nEmployee Name is: " + name + "\nEmployee Salery is: " + salary);
			System.out.println("_________________________");
		}
		sc.close();

	}

}
