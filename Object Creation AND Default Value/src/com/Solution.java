package com;

public class Solution {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		System.out.println("----Employee1----");
		e1.id = 11;
		e1.name = "Sachin";
		e1.salary = 34500.80;
		System.out.println("Employee id: "+e1.id);
		System.out.println("Employee name: "+e1.name);
		System.out.println("Employee salary: "+e1.salary);
		System.out.println("----Employee2----");
		e2.id = 45;
		e2.name = "Santhoh";
		e2.salary = 45500.80;
		System.out.println("Employee id: "+e2.id);
		System.out.println("Employee name: "+e2.name);
		System.out.println("Employee salary: "+e2.salary);
		System.out.println("----Employee3----");
		e3.id = 56;
		e3.name = "sanjith";
		e3.salary = 51500.80;
		System.out.println("Employee id: "+e3.id);
		System.out.println("Employee name: "+e3.name);
		System.out.println("Employee salary: "+e3.salary);
	}

}
