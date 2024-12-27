package com;

public class ClassCastExceptionDemo {

	public static void main(String[] args) {
		// Son class up casted to father
		Father f = new Son();
		// now i will down casted to different object
		Daughter d = (Daughter) f; //CTE --> ClassCastException
	}

}

/*
 * Exception in thread "main" java.lang.ClassCastException: class typecasting.ClassCastException.Son cannot be cast to class typecasting.ClassCastException.Daughter (typecasting.ClassCastException.Son and typecasting.ClassCastException.Daughter are in unnamed module of loader 'app')
	at typecasting.ClassCastException.ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:9)

 */
