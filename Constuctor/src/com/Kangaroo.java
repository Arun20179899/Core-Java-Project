package com;

class Kangaroo {
	float height = 5.5F; // Member/Global Variable(Non-static)

	void display() {
		// when the local variable and global variable name are same, always the local
		// variable will dominate
		double height = 4.4;
		System.out.println(height);
		// therefore in order to differentiate / access the Member variable we will make
		// use of the Keyword "this"
		System.out.println(this.height);
	}

	public static void main(String[] args) {
		Kangaroo k = new Kangaroo();
		k.display();
		// System.out.println(k.height); -> We can directly access in main method
	}
}
