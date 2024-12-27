package org;

public class Employee extends GlobalEsoftsys implements Jspider, Qspider {
	@Override
	public void develop() {
		System.out.println("Developing App");

	}
	@Override
	public void test() {
		System.out.println("Testing App");
	}
	
	// Optionally we can override work() method
	@Override
	void work() {
		System.out.println("working..........");
	}

}
