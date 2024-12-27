package com;

public class Sample {
	// Why static is one copy & non-static is have multiple copies
	// creation
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		// irrespective of whatever happened which will get loaded only one time in the
		// memory i.e stored in class area/static pool area that name called
		// Sample(class name)
		System.out.println(Sample.x);
		// it will get loaded every time you creating an object and stored with
		// different address in
		// the memory called Heap area and it is pointing to the respective reference
		// variable
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		System.out.println(s1.y);
		System.out.println(s2.y);
		System.out.println(s3.y);

	}

}
