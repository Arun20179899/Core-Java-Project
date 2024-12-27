package com;

public class MainClass implements Person{
	public void eat() { // public keyword using mandatory while overriding the abstract method of interface class
		 System.out.println("eating");
	 }
	
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		mc.eat();
		System.out.println(Person.id);
	}

}
