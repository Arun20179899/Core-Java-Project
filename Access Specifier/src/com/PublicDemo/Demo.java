package com.PublicDemo;

// Accessing the public class in same class
public class Demo {
	public int a = 10;

	public void display() {
		System.out.println("access public class in the same class");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.a);
		d.display();		
	}
}
