package www;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		Flipkart f = new Flipkart();
		Scanner scan = new Scanner(System.in);
		System.out.println("Below are the choices\n1:Laptop\n2:Mobile\n3:Watch");
		System.out.println("Enter your choice");
		int choice = scan.nextInt();
		Electronics obj = f.Order(choice);
		if (obj instanceof Laptop) {
			System.out.println("Ordered Laptop");
		} else if (obj instanceof Mobile) {
			System.out.println("Ordered Mobile");
		} else if (obj instanceof Watch) {
			System.out.println("ordered Watch");
		} else {
			System.out.println("choice is invalid");
		}
		scan.close();

	}
}
