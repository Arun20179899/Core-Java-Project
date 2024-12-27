package com.super_calling.Explicitly;

public class Son extends Father {
	Son(){
		super(34); // invoked Explicitly as super class have parameterized constructor
		System.out.println("Hello");
	}

}
