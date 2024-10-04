package com.bptn.course._06_OOP;

class BankAccount {

	// Data members/ properties of the class/attribute
	private String accountNumber;
	private double balance;

	// Constructor the same name with the class name
	// String accountNumber and double intialBalance are parameters
	public BankAccount(String accountNumber, double initialBalance) {

		this.accountNumber = accountNumber;
		this.balance = initialBalance;

	}

	// Instance Method,Class Method, Behavior of the class
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}

	// Getters and Setters
	public double getBalance() {
		return balance;
	}

	public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: " + balance);

	}

}
