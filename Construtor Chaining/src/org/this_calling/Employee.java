package org.this_calling;

public class Employee {
	public Employee(int id) {
		System.out.println(id);
	}

	Employee(int id, String name) { // id = 101, name = John
		this(id); // it was not provide value explicitly we can make use of variable as like
		System.out.println(name);

	}

	public static void main(String[] args) {
		Employee e = new Employee(101, "John");
	}

}
