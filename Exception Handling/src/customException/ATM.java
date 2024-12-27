package customException;

import java.util.Scanner;

import javax.naming.InsufficientResourcesException;


public class ATM {

	public static void main(String[] args) {
		int balance = 10000;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount to be withdraw");
		int amount = sc.nextInt();
		if(amount<=balance) {
			System.out.println("Rs. "+amount+" withdrwal successfully");
		}
		else {
			try {
				throw new InsufficientResourcesException();
			}
			catch(InsufficientResourcesException obj) {
				System.out.println("InSufficient Balance!!! :(");
			}
		}

	}

}
