package com.oops;
/**
 * 1. Abstraction : Showing only the functionality by hiding the implementation
 * 2. To achieve 0 to 100% abstraction we create abstract class
 * 3. We can't instantiate an abstract class as we have undefined methods
 * 4. We can use extends keyword for an abstract class
 * 5. Abstract class can have both abstract as well as non abstract methods
 * 6. We can extend only one abstract class at a time
 * 7. Abstract can be defined with abstract keyword
 */
public abstract class Television {

	int volume;
	int channel;
	
	public Television() {
		// Circuit implementation
		System.out.println("Circuit implememtation procedure/steps..!");
	}

	// abstract methods or bodyless methods or undefined methods
	abstract void turnOnTV();

	abstract void changeChannel();

	abstract void changeVolume();

	abstract void turnOffTV();
	
	abstract void pictureDisplay();
	
	
	// non abstract method or concrete method
	public void internetPort() {
		// method body
		System.out.println("Internet port is optional..!");
	}
	
	public static void main(String[] args) {
		// Television tel = new Television();
	}

}
