package com;

import java.io.NotActiveException;

public class DataTypeDemo {

	public static void main(String[] args) {
		
//		Numeric Data types
		int a = 100;
		int b = 200;
		System.out.println("value of a is: "+a);
		System.out.println("value of b is: "+b);
		System.out.println(a+b);
		System.out.println("sum of a and b is: "+(a+b));
		
//		byte -> -128 to 127
		byte by = 112;
		System.out.println(by);
		
//		short
		short sh = 3456;
		System.out.println(sh);
		
//		long
		long ln = 2345675756L; //needed literal L/l
		System.out.println(ln);
		
//		Decimal data types
		
//		float
		
		float fl = 35474.6789086f;  //needed literal F/f
		System.out.println(fl);
		
//		double
		
		double db = 75836.5733652357383;
		System.out.println(db);
		
//		char
		
		char ch = 'a';
		System.out.println(ch);
		
		String st = "ABC";
		System.out.println(st);
		 
//		case study
//		char cr = "a"; not valid
//		char cr = 'adc'; not valid
//		String sg = 'a'; Not valid
//		String sg = 'asde'; not valid
		
//		boolean
		
		boolean bl = true;
		System.out.println(bl);
		boolean bn = false;
		System.out.println(bn);
		
		
	

	}

}
