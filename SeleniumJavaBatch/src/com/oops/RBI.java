package com.oops;

public interface RBI {
	
	/**
	 * 1. Interface won't allow concrete/non abstract java methods
	 * 2. Interface can't be extended but can be implemented using implements keyword
	 * 3. Default methods are allowed in interface
	 */
	
	// abstract method
	void accountType();
	void KYC();
	
	default void minDeposit(double amount) {
		System.out.println("Minimum deposit amount is : " + amount + " rupees");
	}
	
}
