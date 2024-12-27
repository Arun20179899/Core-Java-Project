package customException;

import java.util.Scanner;

public class LoginGmail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Id");
		String userName = sc.next();
		System.out.println("Enter the Password");
		int password = sc.nextInt();
		if (userName.equals("admin")) {
			if (password == 1234) {
				System.out.println("Login Successfully");
			} else {
				try {
					InvalidPasswordException obj = new InvalidPasswordException();
					throw obj;
				} catch (InvalidPasswordException e) {
					System.out.println("Invalid Password Entered!!!...");
				}
			}
		}
		sc.close();

	}

}
