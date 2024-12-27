package com;

import java.util.Scanner;

public class LoginValidationusingNested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name");
		String user_name = sc.nextLine();
		System.out.println("Enter the password");
		String password = sc.nextLine();

		if (user_name.equalsIgnoreCase("ArunGowda")) {
			System.out.println("User name is valid");
			if (password.equals("Arun@1234")) {
				System.out.println("Password is valid");
				System.out.println("Login Successful");
			} else {
				System.out.println("password is invalid");
				System.out.println("Login Unsuccesful");
			}

		} else {
			System.out.println("User name is invalid");
			System.out.println("Login Unsuccesful");
		}

	}

}
