package com;

public class SmallestofThreeNumbers {
	public static void main(String[] args) {
		int a=34, b=67, c=52;
		
		if ((a<b)&&(a<c)) {
			System.out.println(a+" is a smaller");			
		}
		else if ((b<c)&&(b<a)) {
			System.out.println(b+" is a smaller");			
		}
		else {
			System.out.println(c+" is a smaller");
		}
	}

}
