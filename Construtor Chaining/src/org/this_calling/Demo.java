package org.this_calling;

public class Demo {
	// why constructor chaining - in order to avoid multiple object creation
	Demo() {
		this(23);
		System.out.println(1);
	}

	Demo(int a) {
		this(23, "john");
		System.out.println(a);
	}

	Demo(int a, String b) {
		System.out.println(a + "  " + b);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println("------------------");
		new Demo(); // it is also possible
	}
}
