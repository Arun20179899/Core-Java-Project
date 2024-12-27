package DynamicInputs;

import java.util.Scanner;

public class Car {
	static int count = 0; // store the number of occurrence

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements to be inserted");
		int size = scan.nextInt();

		int[] lg = new int[size];
		System.out.println("Enter the Array elements");
		for (int i = 0; i <= lg.length - 1; i++) {
			lg[i] = scan.nextInt();
			System.out.print(i + "\t");
			System.out.println(lg[i] + "\t");
		}
		System.out.println("Enter the element to find out the no of occurnace");
		long element = scan.nextInt();
		for (int i = 0; i <= lg.length - 1; i++) {
			if (element == lg[i]) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();

	}
}
