package com;

public class MainClass {
	public static void main(String[] args) {
		Solution s1 = new Solution();

		s1.m1();

		System.out.println("********");

		s1.m2(45, 78);

		System.out.println("********");

		String name = s1.m3();
		System.out.println(name);
		System.out.println(s1.m3());

		System.out.println("********");

		int result = s1.m4(67, 89);
		System.out.println(result);
		System.out.println(s1.m4(24, 56));
	}

}
