package com;

public class CANERAATM implements CANERABANK {

	int Balance = 5000;

	@Override
	public void deposit(int depAmount) {
		System.out.println("Depositing Amount Rs.: " + depAmount);
		Balance += depAmount; // shorthand operator
		System.out.println("Amount Deposited Successfully");
	}

	@Override
	public void withdraw(int witAmount) {
		System.out.println("Withdrawing Amount Rs.: " + witAmount);
		Balance -= witAmount;
		System.out.println("Amount Withdrawn Successfully");
	}

	@Override
	public void checkBalance() {
		System.out.println("Amount Balance Rs.: " + Balance);
	}

}
