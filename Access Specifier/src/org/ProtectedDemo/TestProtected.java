package org.ProtectedDemo;

import com.ProtectedDemo.PersonTest;

//The protected members are inherited by the child classes and can access them as its own members. 
//But we can’t access these members using the reference of the parent class. 
//We can access protected members only by using child class reference.  

public class TestProtected extends PersonTest {
	void getData() {
		System.out.println(id);
		System.out.println(sallary);
		toDisplay();
	}

	public static void main(String[] args) {
		TestProtected tp = new TestProtected();
		// access through child class reference variable
		tp.toDisplay();
		System.out.println(tp.id);
		System.out.println(tp.sallary);
		System.out.println("=====================");
		// access through child class method
		tp.getData();
	}

}
