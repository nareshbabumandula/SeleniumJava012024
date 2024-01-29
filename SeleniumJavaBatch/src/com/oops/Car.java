package com.oops;

public class Car {
	
	double price=1000000.00; 
	
	void drive() {
		System.out.println("Driving in super class..!");
	}
	
	public Car() {
		System.out.println("Car class constructor..!");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("Main method 1");
	}

}
