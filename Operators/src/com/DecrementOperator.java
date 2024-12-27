package com;

public class DecrementOperator {

	public static void main(String[] args) {

//		case 1
		int a = 10;
		a--; // a = a - 1;
		System.out.println(a); // 9

//		case 2 -> Post Decrement - Assignment and than decrement
		int b = 10;
		int res1 = b--;
		System.out.println(res1); // 10
		System.out.println(b); // 9

//		case 3 -> Pre Decrement- decrement and than assignment
		int c = 10;
		int res2 = --c;
		System.out.println(res2); // 9
		System.out.println(c); // 9

	}

}
