package com;

public class ToString02 {

	String studentName;
	String collegeName;

	ToString02(String studentName, String collegeName) {
		this.studentName = studentName;
		this.collegeName = collegeName;
	}

	public String toString() {
		return "Student Name is " + studentName + "\nCollege Name is " + collegeName;
	}

	public static void main(String[] args) {
		ToString02 s1 = new ToString02("Arun", "BGS");
		ToString02 s2 = new ToString02("Suhas", "VRS");
		System.out.println(s1);
		System.out.println(s2);

	}

}
