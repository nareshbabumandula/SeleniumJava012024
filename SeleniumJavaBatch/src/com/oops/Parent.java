package com.oops;

public class Parent {
	
	// State or Data or Characteristics or State
	int a=10;
	int b=20;
	
	//Behavior or methods or actions or functionality
	void addition(){
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}
	
	void subtraction(){
		int c=a-b;
		System.out.println("Subtraction of a and b is : " +c);
	}
	
	void multiplication(){
		int c=a*b;
		System.out.println("Multiplication of a and b is : " +c);
	}
	
	void division(){
		int c=b/a;
		System.out.println("Division of a and b is : " +c);
	}
		
	

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.a);
		System.out.println(p.b);
		p.addition();
		p.subtraction();
		p.multiplication();
		p.division();

	}

}
