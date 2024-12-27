package com;

public class VariableDemo {

	public static void main(String[] args) {
		/*
		int a; 			// declaration
		a = 100; 		// assignment
		int a = 100;    //declaration+assignment
		System.out.println("the value of a is:"+a);
		
		a=200; // -> we can reinitialize the value for the same variable
		System.out.println("the value of a is:"+b);
		*/
		
//		Approach 1 -> if all the variables are belongs to different data type than go with this approach
		/*
		int a = 100;
		int b = 200;
		int c = 300;
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
		System.out.println("the value of c is: "+c);
		*/
//		Approach 2 -> if all the variables are belongs to same data type than go with this approach
		/*
		int a,b,c;
		a = 100;
		b = 200;
		c = 300;
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
		System.out.println("the value of c is: "+c);
		*/
//		Approach 3 -> if all the variables are belongs to same data type than go with this approach
		int a=100,b=200,c=300;
		System.out.println(a+" "+b+" "+c); // -> Provider space with concatenation

	}

}
