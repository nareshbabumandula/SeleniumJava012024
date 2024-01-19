package com.oops;

public class Child extends Arithmetic {
		
	// State or Data or Characteristics or State
	int a=100;
	int b=20;
	
	//Behavior or methods or actions or functionality
	void modulus(){
		int c=a%b;
		System.out.println("Modulus of a and b is : " +c);
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();
		c.modulus();
	}

}
