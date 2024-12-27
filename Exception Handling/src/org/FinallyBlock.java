package org;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Start");

		try {
			System.out.println(10 / 0);
		} 
		catch (ArithmeticException e) {
			System.out.println("invalid");
		} 
		finally {
			System.out.println("inside invalid block");
		}
		System.out.println("End");
	}

}
