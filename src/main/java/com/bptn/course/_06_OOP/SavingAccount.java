package com.bptn.course._06_OOP;

class SavingAccount extends BankAccount {

	private double intrestRate;

	public SavingAccount(String accountNumber, double initialBalance, double intrestRate) {
		super(accountNumber, initialBalance);
		this.intrestRate = intrestRate;

	}

	public void applyInterest() {
		double interest = getBalance() * intrestRate / 100;
		deposit(interest);
	}
}
