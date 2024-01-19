package com.oops;

public class B extends A {
	
	void m2() {
		System.out.println("Executing m2 method from B class..!");
	}

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
	}

}
