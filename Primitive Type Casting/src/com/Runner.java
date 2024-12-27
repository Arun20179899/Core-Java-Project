package com;

public class Runner {

	// In Java, Why we are using abbreviation l for long and f for float data types
	public static void main(String[] args) {
		System.out.println(10); // int
		System.out.println(4.5); // double

		float f = (float) 4.7;
		float f1 = 5.67F;
		float f2 = 57.78f;
		
		long l = 34657765735l;
		long l1 = 87684382947L;
		
		float gf = 6.7f;
		
		long ln = 465956594904l;
		int in= (int) ln;
		System.out.println(in); // we have data loss here
	}

}
