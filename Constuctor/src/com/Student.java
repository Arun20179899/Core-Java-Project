package com;

public class Student {
	int id;
	String name;
	static String stdcollege = "BGS Institute of Technology";

	Student(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
//	How do we avoid redundancy
//	To avoid multiple print statement, we can created display() method to print details
	void display() { 
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(Student.stdcollege);
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "John");
		Student s2 = new Student(102, "Tommi");
		Student s3 = new Student(103, "jerry");
		s1.display();
		s2.display();
		s3.display();
//		System.out.println("---------Details-----------");
//		System.out.println(s1.id+"  "+s1.name+"  "+Student.stdcollege);
//		System.out.println(s2.id+"  "+s2.name+"  "+Student.stdcollege);
	}

}
