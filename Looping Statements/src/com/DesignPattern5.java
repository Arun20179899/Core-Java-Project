package com;

import java.awt.color.ColorSpace;

public class DesignPattern5 {

	public static void main(String[] args) {
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
//	  *******
//	   *****
//	    ***
//	     *
		int star = 1, space = 4;
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= space; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println("");
			star += 2;
			space--;
		}
		int star1 = 7, space1 = 1;
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= space1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star1; j++) {
				System.out.print("*");
			}
			System.out.println("");
			star1 -= 2;
			space1++;
		}
	}

}
