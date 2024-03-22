package com.oops;

public class C extends B {
	
	void m3() {
		System.out.println("Executing m3 method from C class..!");
	}

	public static void main(String[] args) {
		C c = new C(); // Create instance/object reference for a class C
		c.m1();
		c.m2();
		c.m3();
	}

}
