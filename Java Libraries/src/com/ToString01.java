package com;

public class ToString01 { // implicitly inheriting the object class properties
	
	public String toString()
	{
		return "Hi Java";
	}
	public static void main(String[] args) {
		ToString01 t1 = new ToString01();
		ToString01 t2 = new ToString01();
		System.out.println(t1); // implicitly calls the toString() method - String representative - FQCN@HDV
		System.out.println(t2.toString()); // Explicitly defined the toString method

	}

}
