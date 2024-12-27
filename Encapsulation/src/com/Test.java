package com;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		//access the private members indirectly with the help of setter and getter method
		p.setAge(67);
		int age = p.getAge();
		System.out.println(age);
		System.out.println(p.getAge());
	}
}
