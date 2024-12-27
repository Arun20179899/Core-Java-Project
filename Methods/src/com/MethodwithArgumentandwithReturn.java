package com;

public class MethodwithArgumentandwithReturn {

	int findsquare(int n) {
		return n * n;
	}

	public static void main(String[] args) {
		MethodwithArgumentandwithReturn m1 = new MethodwithArgumentandwithReturn();
		int stored = m1.findsquare(5);
		System.out.println(stored);
		System.out.println(m1.findsquare(6));

	}

}
