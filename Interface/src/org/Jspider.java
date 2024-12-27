package org;

public interface Jspider {
	void develop();
	// we have access concrete methods in the interface through default and static keyword
	default void work(int a) {
		System.out.println("Value of a: "+a);
	}
	static void work() {
		System.out.println("working in Jspider");
	}

}
