package com;

public class Runner {

	public static void main(String[] args) {
		System.out.println("------Student1------");
		StudentDetails sd1 = new StudentDetails();
		sd1.getid(101);
		sd1.getname("Arun");
		System.out.println(StudentDetails.stdclg);
		System.out.println("------Student2------");
		StudentDetails sd2 = new StudentDetails();
		sd2.getid(102);
		sd2.getname("Arjun");
		System.out.println(StudentDetails.stdclg);
		System.out.println("------Student3------");
		StudentDetails sd3 = new StudentDetails();
		sd3.getid(103);
		sd3.getname("Sowmya");
		System.out.println(StudentDetails.stdclg);
		System.out.println("------Student4------");
		StudentDetails sd4 = new StudentDetails();
		sd4.getid(104);
		sd4.getname("Ranjitha");
		System.out.println(StudentDetails.stdclg);

	}

}
