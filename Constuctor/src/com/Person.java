package com;

public class Person {
int age;

 Person(int a) {
	age = a;
}
	public static void main(String[] args) {
	Person p1 = new Person(34);
	Person p2 = new Person(45);
	System.out.println("Age "+p1.age+"       "+"Age "+p2.age);
}
}
