package com.oops;

public class GrandChild extends Child{
	
	// State or Data or Characteristics or State
	double a=100;
	double b=50;
	
	//Behavior or methods or actions or functionality
	void calculatePercentage(){
		double c=(b/a)*100;
		System.out.println("Percentage of b is : " +c);
	}

	public static void main(String[] args) {
		GrandChild gc = new GrandChild();
		gc.calculatePercentage();
		gc.addition();
		gc.multiplication();
		gc.division();
		gc.subtraction();
		gc.modulus();
	}

}
