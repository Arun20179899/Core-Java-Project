package com;

import java.util.Scanner;

public class UserSolution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CANERABANK CB = new CANERAATM();
		while (true) {
			System.out.println("1:Deposite\n2:Withdraw\n3:checkBalance\n4:exit");
			System.out.println("Enter the choice");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Amount to be deposite");
				int dAmount = s.nextInt();
				CB.deposit(dAmount);
				break;
			case 2:
				System.out.println("Enter the Amount to be withdraw");
				int wAmount = s.nextInt();
				CB.withdraw(wAmount);
				break;
			case 3:
				CB.checkBalance();
				break;
			case 4:
				System.out.println("Thank YOU!!! -- CANERA ATM");
				System.exit(0);
				break;
			default:
				System.out.println("Choice is invalid");
			}
		}

	}

}
