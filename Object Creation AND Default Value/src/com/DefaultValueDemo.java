package com;

public class DefaultValueDemo {
	
	int a;
	double b;
	char  c;
	boolean d;
	String e;
	public static void main(String[] args) {
		DefaultValueDemo dvd = new DefaultValueDemo();
		System.out.println(dvd.a); //0
		System.out.println(dvd.b); //0.0
		System.out.println(dvd.c); //space
		System.out.println(dvd.d); //false
		System.out.println(dvd.e); //null
	}

}
