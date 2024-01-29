package com.oops;

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
