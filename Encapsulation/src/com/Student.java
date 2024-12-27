package com;

public class Student {
	// if we use age as public we have accept illogical initialization
	// public int age;
	private int age;

	public Student(int age) {
		if (age > 0) {
			System.out.println("Age is initialized");
			this.age = age;
		}
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		// here some validation
		if (age > 0) {
			System.out.println("Age is initialized");
			this.age = age;
		} else {
			System.out.println("Age is not initialized");
		}

	}
}
