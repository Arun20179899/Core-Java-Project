package org.this_calling;

public class Student {
	Student(int age) {
		this("Arun");
		System.out.println("Student age: " + age);
	}

	Student(String name) {
		System.out.println("Student Name: " + name);
	}

	Student(double height) {
		this(27);
		System.out.println("Student height: " + height);
	}

	Student(char grade) {
		this(5.9);
		System.out.println("Student grade: " + grade);

	}

	public static void main(String[] args) {
		Student s  = new Student('A');
		System.out.println("-------------------");
		new Student('A'); // it is also possible

	}

}
