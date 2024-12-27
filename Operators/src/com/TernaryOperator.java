package com;

public class TernaryOperator {

	public static void main(String[] args) {

//		Syntax -> Variable = Expression ? true : false;
//		Example1
		int a = 200, b = 100;
		int x = (a < b) ? a : b;
		System.out.println(x); // 100

//		Example2
		int y = (1 == 1) ? 100 : 200;
		System.out.println(y); // 100

//		Example3
		int z = (1 == 2) ? 200 : 100;
		System.out.println(y); // 100

//		Example4
		int Person_Age = 17;
		String res = (Person_Age >= 18) ? "Eligible" : "Not Eligible";
		System.out.println(res); // Not Eligible

	}

}
