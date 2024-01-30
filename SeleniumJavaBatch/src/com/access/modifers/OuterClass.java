package com.access.modifers;

public class OuterClass {

	// nested class - class within the another class
	private static class InnerStaticClass{

		private String name;

		public InnerStaticClass(String name) {
			this.name=name;
		}

		public void diplayName() {
			System.out.println("Name is : " + name);
		}
	}


	private class InnerClass {

		private int age;

		public InnerClass(int age) {
			this.age=age;
		}

		public void displayAge() {
			System.out.println("Age is : " + age);
		}
	}


	public static void main(String[] args) {
		// Creating obj reference for an inner static class
		InnerStaticClass obj = new InnerStaticClass("John");
		obj.diplayName();
		
		// Creating obj reference for an inner concrete class
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass(28);
		inner.displayAge();
		
	}

}
