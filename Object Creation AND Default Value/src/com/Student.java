package com;

public class Student {
//	to get the student name and marks for 2 students
	String name;
	int marks;
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1.name+" has scored "+s1.marks+" in the subject JAVA");
		System.out.println(s2.name+" has scored "+s2.marks+" in the subject JAVA");
		System.out.println("-------------------");
		s1.name = "Arun";
		s1.marks = 50;
		System.out.println(s1.name+" has scored "+s1.marks+" in the subject JAVA");
		System.out.println("-----------");
		s2.name = "Arjun";
		s2.marks = 59;
		System.out.println(s2.name+" has scored "+s2.marks+" in the subject JAVA");
	}

}
