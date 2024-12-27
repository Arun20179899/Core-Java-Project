package com;

public class DesignPattern2 {

	public static void main(String[] args) {
//		*****
//		 ****
//		  ***
//		   **
//		    *
		int space = 0, star = 5;
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= space; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=star; j++) {
				System.out.print("a");
			}
			System.out.println("");
			space++;
			star--;
		}

	}

}
