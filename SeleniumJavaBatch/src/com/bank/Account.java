package com.bank;

public class Account {
	int currentBalance = 1000;
	int amount;
	void deposit() {
		amount = 300;
		currentBalance = (currentBalance + amount); 
		System.out.println("Amount has successfully deposited  = " +currentBalance);
	}
	
	void withdrawl() {
		amount = 500;
		currentBalance = (currentBalance - amount);
		System.out.println("Amount has successfully Withdrawn= " + currentBalance);
	}
	
	 
	  int getcurrentbalance() {
		return getcurrentbalance();
	}
    

	public static void main(String[] args) {
		Account act = new Account();
        System.out.println("Hello,Welcome to the Banking Application ");
		System.out.println(act.currentBalance);
		act.deposit();
		act.withdrawl();
				
	
	}
	

}
