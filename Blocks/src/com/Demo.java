package com;

public class Demo {
	// static blocks overview
	// static block executed before main method	
	static {
		System.out.println("In static block-1"); // if multiple static block it will executed sequential manner
	}
	public static void main(String[] args) {
		System.out.println("Hello");

	}
	static {
		System.out.println("In static block-2");
	}
	static {
		System.out.println("in static block-3");
	}

}
