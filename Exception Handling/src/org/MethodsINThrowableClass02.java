package org;

public class MethodsINThrowableClass02 {

	public static void main(String[] args) {
		
		char[] c = {'a', 'b', 'c', 'd'};
		
		try {
		System.out.println(c[4]);
		}
		catch(Exception e) {
			String msg = e.getMessage(); // getting the message of what reason exception is occur
			System.out.println(msg);
		}

	}

}
//Index 4 out of bounds for length 4

//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//at org.MethodsINThrowableClass02.main(MethodsINThrowableClass02.java:8)