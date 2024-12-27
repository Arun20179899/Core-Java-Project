package com;

public class EvenNumbersusingForWhileDowhile {

	public static void main(String[] args) {
		
		System.out.println(">>>>>print even numbers by using for loop<<<<<");
		for(int i = 2; i<=20;i+=2) {
			System.out.println(i);
		}
		
		System.out.println(">>>>>print even numbers by using while loop<<<<<");
		int n = 2;
		while(n<=20) {
			System.out.println(n);
			n=n+2;
		}
		System.out.println(">>>>>print even numbers by using do-while loop<<<<<");
		int k = 2;
		do {
			System.out.println(k);
			k=k+2;
		}while(k<=20);
	}

}
