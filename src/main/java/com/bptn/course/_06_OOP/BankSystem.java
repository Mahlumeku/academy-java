package com.bptn.course._06_OOP;

public class BankSystem {

	public static void main(String[] args) {
		
		//BankAccount testAccount = new BankAccount("987654", 1200.00);
		//testAccount.displayAccountInfo();
		
		//BankAccount newTestAccount = new BankAccount("123456", 600.00);
		//newTestAccount.displayAccountInfo();
		
		//SavingAccount myAccount = new SavingAccount("123456", 600.00, 1.00);
		//myAccount.applyInterest();
		//myAccount.displayAccountInfo();
		
		CheckingAccount myChekingAccount = new CheckingAccount("1234", 500, 200);
		myChekingAccount.withdraw(300);
		myChekingAccount.displayAccountInfo();
	}

}
