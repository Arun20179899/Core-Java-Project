package com;

public class AccountHolder {

	public static void main(String[] args) {

		CANERABANK cb = new CANERAATM();
		cb.deposit(50000);
		cb.checkBalance();
		System.out.println("------------------");

		cb.withdraw(36000);
		cb.checkBalance();
		System.out.println("------------------");

		cb.deposit(56099);
		cb.withdraw(9876);
		cb.checkBalance();
	}

}
