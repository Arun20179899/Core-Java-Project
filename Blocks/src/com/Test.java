package com;

public class Test {
	{
		System.out.println("In Non-Static block-1");
	}
	{
		System.out.println("In Non-Static block-2");
	}
	public static void main(String[] args) {

		Test t = new Test();
		System.out.println("Java.......");


	}
	{
		System.out.println("In Non-Static block-3");
	}
}
