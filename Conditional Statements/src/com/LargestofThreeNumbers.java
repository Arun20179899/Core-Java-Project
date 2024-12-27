package com;

public class LargestofThreeNumbers {

	public static void main(String[] args) {
		int a=10,b=30,c=54;
		if ((a>b)&&(a>c)) {
			System.out.println("a is greater and value is: "+a);
		}
		else if ((b>c)&&(b>a)) {
			System.out.println("b is geater and value is: "+b);
		}
		else {
			System.out.println("c is greater and value is: "+c);
		} 

	}

}
