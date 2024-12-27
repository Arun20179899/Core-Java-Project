package com;

public class DesignPattern1 {

	public static void main(String[] args) {
//		***** 12345 11111 12345 55555
//		****  1234  2222  2345  4444
//		***   123   333   345   333
//		**    12    44    45    22
//		*     1     5     5     1
		int k = 5;
		for (int i = 1; i <= 5; i++) {

			for (int j = i; j <= 5; j++) {
				System.out.print(j);
//				System.out.print(i);

			}
			System.out.println("");
			k--;
		}
	}
}
