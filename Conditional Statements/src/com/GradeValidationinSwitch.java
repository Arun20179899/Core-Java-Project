package com;

import java.util.Scanner;

public class GradeValidationinSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Grade");
		String grade = sc.nextLine();
		switch (grade) {
		case "A":System.out.println("Your marks is in between 91 and 100");break;
		case "B":System.out.println("Your marks is in between 81 and 90");break;
		case "C":System.out.println("Your marks is in between 71 and 80");break;
		case "D":System.out.println("Your marks is in between 61 and 70");break;
		case "E":System.out.println("Your marks is in between 51 and 60");break;
		case "F":System.out.println("Your marks is in between 41 and 50");break;
		default:System.out.println("Invalid");break;
		}		

	}

}
