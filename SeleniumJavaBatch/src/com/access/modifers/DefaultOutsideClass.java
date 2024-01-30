package com.access.modifers;

public class DefaultOutsideClass {
		
	public static void main(String[] args) {
		System.out.println("Accessing constructor, variables and methods with default acccess modifier outside the class");
		DefaultTest dt = new DefaultTest();
		System.out.println(dt.a);
		System.out.println(dt.b);
		dt.addition();
	}

}
