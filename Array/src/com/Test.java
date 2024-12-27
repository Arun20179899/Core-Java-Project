package com;

public class Test {
	public static void main(String[] args) {
		int[] values = { 34, 56, 78, 90, 67, 78 };
		int sum = 0;
		System.out.println("----print sum of n values-----");
		for (int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		System.out.println(sum);

		System.out.println("-------print in reverse order----------");
		for (int i = values.length - 1; i >= 0; i--) {
			System.out.println(i + "\t" + values[i]);

		}
	}
}
