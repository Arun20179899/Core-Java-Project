package customException;

import java.util.Scanner;

public class Matrimol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		if (age >= 22) {
			System.out.println("You can happily married");
		} else {
			try {
				throw new AgeInvalidException("Have patience, you not yet crossed 21");
			} catch (AgeInvalidException obj) {
				System.out.println(obj.getMessage());
			}
		}

	}

}
