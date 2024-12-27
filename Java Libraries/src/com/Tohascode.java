package com;

public class Tohascode {
	@Override
	public int hashCode() {
		return 1234;
	}

	public static void main(String[] args) {
		Tohascode h = new Tohascode();
		System.out.println(h.hashCode()); // return unique value of the object

	}

}
