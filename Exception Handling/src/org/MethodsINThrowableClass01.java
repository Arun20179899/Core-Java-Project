package org;

public class MethodsINThrowableClass01 {

	public static void main(String[] args) {

		System.out.println("Start");
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			e.printStackTrace(); // provided the full details of exception

		}

		System.out.println("End");

	}

}
// Exception occurs before handle 
/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * org.MethodsINThrowableClass.main(MethodsINThrowableClass.java:9)
 */
// provided the full details of exception
/*
 * java.lang.ArithmeticException: / by zero at
 * org.MethodsINThrowableClass.main(MethodsINThrowableClass.java:9)
 */