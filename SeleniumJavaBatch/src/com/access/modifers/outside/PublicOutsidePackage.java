package com.access.modifers.outside;

import com.access.modifers.PublicTest;

public class PublicOutsidePackage {

	public static void main(String[] args) {
		System.out.println("Accessing constructor, variables and methods with public acccess modifier outside the package");
		PublicTest pt = new PublicTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
