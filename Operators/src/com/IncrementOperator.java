package com;

public class IncrementOperator {

	public static void main(String[] args) {

//		case 1
		int a = 10;
		a++; // a = a + 1;
		System.out.println(a); // 11

//		case 2 -> Post Increment - Assignment and than increment
		int b = 10;
		int res1 = b++;
		System.out.println(res1); // 10
		System.out.println(b); // 11

//		case 3 -> Pre increment- increment and than assignment
		int c = 10;
		int res2 = ++c;
		System.out.println(res2); // 11
		System.out.println(c); // 11

	}

}
