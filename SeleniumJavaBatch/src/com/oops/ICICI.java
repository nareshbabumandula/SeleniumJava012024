package com.oops;

public class ICICI implements RBI{

	public static void main(String[] args) {
		ICICI icici = new ICICI();
		icici.accountType();
		icici.KYC();
		icici.minDeposit(1000.00);
	}

	@Override
	public void accountType() {
		System.out.println("Savings, Current, Joint & De-mat account facilities are available");		
	}

	@Override
	public void KYC() {
		System.out.println("KYC is taken care..!");
	}

}
