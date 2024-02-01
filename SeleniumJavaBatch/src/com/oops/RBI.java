package com.oops;

public interface RBI extends FederalReserve, Bank{
	
	/**
	 * 1. Interface won't allow concrete/non abstract java methods
	 * 2. Interface can't be extended but can be implemented using implements keyword
	 * 3. Default methods are allowed in interface
	 * 4. To achieve 100% abstraction we go for interface
	 * 5. Interface is defined with interface keyword
	 * 6. A java class can implement multiple interfaces separated by comma, hence multiple inheritance is possible interfaces
	 * 7. One interface can extend multiple interfaces separated by comma
	 * 8. Interface allows static and default methods as well along with abstract methods
	 * 9. By default all the methods and variables of an interface are final and abstract
	 */
			
	// Implicitly public, static and final
	double minWithDrawl=100.00;
	//double maxDeposit=10000.00;
	
	// abstract method implicitly public, static and final
	void accountType();
	void KYC();
	
	default void minDeposit(double amount) {
		System.out.println("Minimum deposit amount is : " + amount + " rupees");
	}
	
	
}
