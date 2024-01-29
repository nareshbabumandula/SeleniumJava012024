package com.oops;

public class A {

	int x,y,z;

	void m1() {
		System.out.println("Executing m1 method from A class..!");
	}
	
	// no argument constructor
	public A() {
		System.out.println("This is a no argument constructor..!");
	}

	// parameterized constructor
	public A(int x, int y) {
		System.out.println("This is a parameterized constructor..!");
		this.x=x;
		this.y=y;
	}
	
	// parameterized constructor
	public A(int x, int y, int z) {
		System.out.println("This is a parameterized constructor..!");
		this.x=x;
		this.y=y;
		this.z=z;
	}


	public static void main(String args[]) {
		System.out.println("Calling constructor with no arguments");
		A a = new A();
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a.z);
		
		System.out.println("Calling constructor with 2 arguments");
		A a1 = new A(100, 200);
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a1.z);
		
		System.out.println("Calling constructor with 3 arguments");
		A a2 = new A(10, 20, 30);
		System.out.println(a2.x);
		System.out.println(a2.y);
		System.out.println(a2.z);
		
	}

}
