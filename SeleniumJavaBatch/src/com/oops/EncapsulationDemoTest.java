package com.oops;

//EncapsulationDemo.java

//Class representing a BankAccount with encapsulation
class BankAccount {
	private String accountHolder;
	private double balance;

	// Constructor
	public BankAccount(String accountHolder, double initialBalance) {
		this.accountHolder = accountHolder;
		this.balance = initialBalance;
	}

	// Getter method for accountHolder
	public String getAccountHolder() {
		return accountHolder;
	}

	// Setter method for accountHolder
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	// Getter method for balance
	public double getBalance() {
		return balance;
	}

	// Method to deposit money into the account
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	// Method to withdraw money from the account
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds");
		}
	}
}

public class EncapsulationDemoTest {
	public static void main(String[] args) {
		// Creating an instance of BankAccount
		BankAccount myAccount = new BankAccount("John Doe", 1000.0);

		// Accessing and modifying data using encapsulation
		System.out.println("Account Holder: " + myAccount.getAccountHolder());
		System.out.println("Balance: $" + myAccount.getBalance());

		myAccount.deposit(500.0);
		myAccount.withdraw(200.0);

		// Attempting to directly access private fields (which is not allowed)
		// Uncommenting the line below would result in a compilation error
		//System.out.println(myAccount.balance);
	}
}
