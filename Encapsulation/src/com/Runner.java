package com;

public class Runner {
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.getId() + "\t" + e.getName());
		System.out.println("======================");
		e.setId(101);
		e.setName("Arun");
		System.out.println(e.getId() + "\t" + e.getName());
	}

}
