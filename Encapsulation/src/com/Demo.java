package com;

public class Demo {
	public static void main(String[] args) {
		Student s = new Student(34);
		// s.age = 20;
		// System.out.println(s.age);
		// s.age = -20;
		// System.out.println(s.age);
		System.out.println("Age:" + s.getAge());
		s.setAge(45);
		System.out.println("Age:" + s.getAge());
		s.setAge(56);
		System.out.println("Age:" + s.getAge());
		s.setAge(67);
		System.out.println("Age:" + s.getAge());

	}
}
