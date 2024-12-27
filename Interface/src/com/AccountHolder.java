package com;

public class AccountHolder implements HDFCBank {
	@Override
	public void withdraw() {
		System.out.println("withdrawn");
	}

	@Override
	public void deposit() {
		System.out.println("deposited");
	}

	public static void main(String[] args) {
		AccountHolder ah = new AccountHolder();
		ah.deposit();
		ah.withdraw();

	}
}
