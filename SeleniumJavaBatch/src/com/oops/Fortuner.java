package com.oops;

public class Fortuner {
	
	// Method overloading/Compile time Polymorphism -- Having same methods in a class with different signature
	void drive() {
		System.out.println("Driving..!");
	}
	
	void drive(String mode) {
		System.out.println("Driving in " + mode + " mode");
	}	
	
	void drive(String mode, int speed) {
		System.out.println("Driving in " + mode + " mode with speed " + speed + " kmph");
	}
	
	void drive(String mode, int speed, double mileage) {
		System.out.println("Driving in " + mode + " mode with speed " + speed + " kmph with mileage of " + mileage + " kmpl");
	}
	
	public Fortuner() {
		System.out.println("This is a no argument constructor for Fortuner class");
	}	
	
	public Fortuner(String model) {
		System.out.println("This is a parameterized constructor for Fortuner class with model " + model);
	}
	
	public static void main(String[] args) {
		Fortuner fort = new Fortuner();
		fort.drive();
		fort.drive("sports");
		fort.drive("eco");
		fort.drive("normal");
		fort.drive("sports", 100);
		fort.drive("eco", 80, 15);
		
		Fortuner fortuner = new Fortuner("4X4 Automatic");
		
	}

}
