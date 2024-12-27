package com;

import java.util.Scanner;

public class MatrimonyValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------enter the details-----------");
		System.out.println("Enter the gender");
		String gender = sc.nextLine();
		System.out.println("Enter the age");
		byte age = sc.nextByte();
		if (gender.equalsIgnoreCase("Male")) {
			System.out.println("gender is valid");
			if (age >= 21) {
				System.out.println("age is valid");
				System.out.println("you can get marriege");

			} else {
				System.out.println("age is not valid");
				System.out.println("have patience");

			}

		} else if (gender.equalsIgnoreCase("Female")) {
			System.out.println("gender is valid");
			if (age >= 18) {
				System.out.println("age is valid");
				System.out.println("you can get marrieage");
			} else {
				System.out.println("age is not valid");
				System.out.println("have patience");
			}

		}

		else {
			System.out.println("invalid data");

		}

	}

}
/*
System.out.println("--------enter the female details-----------");
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter the gender");
String gender_female = sc1.nextLine();
System.out.println("Enter the age");
byte age_female = sc1.nextByte();
*/
