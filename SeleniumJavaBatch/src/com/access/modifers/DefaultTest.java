package com.access.modifers;

public class DefaultTest {
	
	int a=10;
	int b=20;
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
	
	DefaultTest() {
		System.out.println("Executing default access modifier constructor..!");
	}
	
	public static void main(String[] args) {
		DefaultTest dt = new DefaultTest();
		System.out.println(dt.a);
		System.out.println(dt.b);
		dt.addition();
	}

}
