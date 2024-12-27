package com;

public class MethodwithoutArgumentandwithReturn {
	
	int add(){
		int a = 15;
		int b = 34;
		int result = a+b;
		return result;
	}

	public static void main(String[] args) {
		MethodwithoutArgumentandwithReturn m1 = new MethodwithoutArgumentandwithReturn();
		int stored = m1.add();
		System.out.println(stored);
		System.out.println(m1.add());

	}

}
