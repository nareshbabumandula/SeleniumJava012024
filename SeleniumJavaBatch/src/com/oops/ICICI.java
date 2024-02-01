package com.oops;

public class ICICI implements RBI, FederalReserve, Bank{
	
	@Override
	public void accountType() {
		System.out.println("Savings, Current, Joint & De-mat account facilities are available");		
	}

	@Override
	public void KYC() {
		System.out.println("KYC is taken care..!");
	}
	
	void setminWithDrawl(double amount) {
		//minWithDrawl=amount;  //The final field RBI.minWithDrawl cannot be assigned
	}

	public static void main(String[] args) {
		ICICI icici = new ICICI();
		icici.accountType();
		icici.KYC();
		icici.minDeposit(1000.00);
		System.out.println(RBI.minWithDrawl);
		icici.setminWithDrawl(500.00);
		System.out.println(FederalReserve.maxDeposit);
		System.out.println(Bank.maxDeposit);
		
	}

	

}
