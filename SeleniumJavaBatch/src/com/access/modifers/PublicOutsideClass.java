package com.access.modifers;

public class PublicOutsideClass {

	public static void main(String[] args) {
		System.out.println("Accessing constructor, variables and methods with public acccess modifier outside the class");
		PublicTest pt = new PublicTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
