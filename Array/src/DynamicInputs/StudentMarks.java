package DynamicInputs;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements to be inserted");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = scan.nextInt();

		}
		System.out.println("Array Elements are ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + "\t");
			System.out.println(a[i] + "\t");

		}

		System.out.println("Enter the element to be find out the number of occurance");
		int element = scan.nextInt();
		int count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (element == a[i]) {
				count++;
			}
		}
		System.out.println("No of occurance of " + element + " is " + count);
		scan.close();
	}

}

// a 100	200		300
// i 0		1		2