package com;

import java.util.Scanner;

public class LargestofThreeusingNested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		System.out.println("Enter the value of c");
		int c = sc.nextInt();
		if(a>b) {
//			System.out.println("a is greater than b");
			if (a>c) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("c is greater");
			}
		}
		else if (b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}

	}

}
