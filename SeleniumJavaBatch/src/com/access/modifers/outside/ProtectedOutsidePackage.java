package com.access.modifers.outside;

import com.access.modifers.ProtectedTest;

public class ProtectedOutsidePackage extends ProtectedTest {

	public static void main(String[] args) {
		//System.out.println("Accessing constructor, variables and methods with protected acccess modifier outside the package");
		//ProtectedTest pt = new ProtectedTest();
		//System.out.println(pt.a);
		//System.out.println(pt.b);
		//pt.addition();
		
		System.out.println("Accessing constructor, variables and methods with protected acccess modifier outside the package via inheritance");
		ProtectedOutsidePackage pop = new ProtectedOutsidePackage();
		System.out.println(pop.a);
		System.out.println(pop.b);
		pop.addition();
	}

}
