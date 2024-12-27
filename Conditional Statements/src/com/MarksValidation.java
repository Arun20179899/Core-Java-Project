package com;

import java.util.Scanner;

public class MarksValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter your marks");
			int marks = sc.nextInt();
			if ((marks >= 85) && (marks <= 100)) {
				System.out.println("you have distinction");
			} else if ((marks >= 35) && (marks <= 84)) {
				System.out.println("you have first clss");
			} else if ((marks >= 0) && (marks <= 34)) {
				System.out.println("you have fail");
			} else {
				System.out.println("invalid marks");
			}

		}
		

	}

}
