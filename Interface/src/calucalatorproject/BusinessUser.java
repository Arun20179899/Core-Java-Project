package calucalatorproject;

import java.util.Scanner;

public class BusinessUser {

	public static void main(String[] args) {

		System.out.println("---Welcome to Calucalator Project");
		System.out.println("================================");

		while(true) {
			Scanner scan = new Scanner(System.in);
			Calucalator c = new CalucalatorImp();

			System.out.println("1: Addition\n2: Substraction\n3: Multiplication");
			System.out.println("4: Division\n5: Exit");

			System.out.println("Enter the Choice");
			int choice = scan.nextInt();
			int a = 0;
			int b = 0;
			if (choice >= 1 && choice <= 4) {
				System.out.println("Enter the first number");
				a = scan.nextInt();
				System.out.println("enter the second number");
				b = scan.nextInt();
			}

			switch (choice) {

			case 1:
				System.out.println("Sum: " + c.add(a, b));
				break;
			case 2:
				System.out.println("Diff: " + c.sub(a, b));
				break;
			case 3:
				System.out.println("Production: " + c.mul(a, b));
				break;
			case 4:
				System.out.println("Quationt: " + c.div(a, b));
				break;
			case 5:
				System.out.println("Thank You");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
		}

	}

}
