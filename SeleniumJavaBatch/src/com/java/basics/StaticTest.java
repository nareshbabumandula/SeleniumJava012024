package com.java.basics;

public class StaticTest {
	
	static int a=10;
	static int b=20;
	
	static void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		addition();
	}

}
