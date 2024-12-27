package com.super_calling.Implicitly;

public class Son extends Father { // IS-A Relationship
	Son() {
		// Super(); Super calling invoked super class constructor implicitly as it is a
		// Non-Parameteraized Constructor
		System.out.println("Sub Class executing");
	}
}
