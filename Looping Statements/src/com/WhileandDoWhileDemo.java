package com;

public class WhileandDoWhileDemo {

	public static void main(String[] args) {
		System.out.println("--------while loop-------");
		int n = 1;
		while(n<=5) {
			System.out.println(n);
			n++;
		}
		System.out.println("----------reverse order------------");
		int x = 5;
		while(x>=1) {
			System.out.println(x);
			x--;
		}
		System.out.println("----------do-while loop------------");
		int y = 1;
		do {
			System.out.println(y);
			y++;
		} while (y<=5);
		System.out.println("--------reverse order---------------");
		int z=10;
		do {
			System.out.println(z);
			z--;
		}while(z>=1);

	}

}
