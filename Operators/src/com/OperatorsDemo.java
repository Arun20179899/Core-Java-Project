package com;

public class OperatorsDemo {

	public static void main(String[] args) {
		
//		Arithmetic Operators + - * / %
		
		int a = 20, b = 10;
		System.out.println("Sum of a and b is: "+(a+b));
		System.out.println("Difference of a and b is: "+(a-b));
		System.out.println("Multiflication of a and b is: "+(a*b));
		System.out.println("Division of a and b is: "+(a/b));
		System.out.println("Modulo division of a and b is: "+(a%b));
		
//		Relational/Comparison Operators > >= < <= != ==
		// returns always boolean value -> true/ false
		System.out.println(a>b);
		System.out.println(a>=b);
		b=20;
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		boolean res = a>=b;		
		System.out.println(res);
		
//		Logical Operators && || !
		// returns always boolean value - true/false
		// it works around 2 boolean values/variables
		
		boolean x = true;
		boolean y = false;
		System.out.println(x && y); //false
		System.out.println(x || y); // true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		boolean b1 = 10>20;
		boolean b2 = 20>10;
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		System.out.println(!b1); // true
		System.out.println(!b2); //false
		System.out.println((20>10)&&(10<20)); // true ->combination of relational and logical operator
		
		
		

	}

}
