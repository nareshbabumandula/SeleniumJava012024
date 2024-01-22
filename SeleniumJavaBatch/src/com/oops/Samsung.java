package com.oops;

public class Samsung extends Television{

	public static void main(String[] args) {
		Samsung samsung = new Samsung();
		samsung.turnOnTV();
		samsung.turnOffTV();
		samsung.changeVolume();
		samsung.changeChannel();
		samsung.pictureDisplay();
		samsung.internetPort();
		samsung.appStore();
		
		// Upcasting -- Converting subtype to super type
		Television tel = new Samsung(); // Samsung IS-A Television
		
		
	}

	@Override
	void turnOnTV() {
		System.out.println("turnOnTV feature is available..!");
	}

	@Override
	void changeChannel() {
		System.out.println("changeChannel feature is available..!");
	}

	@Override
	void changeVolume() {
		System.out.println("changeVolume feature is available..!");
	}

	@Override
	void turnOffTV() {
		System.out.println("turnOffTV feature is available..!");
	}

	@Override
	void pictureDisplay() {
		System.out.println("pictureDisplay feature is available..!");
	}
	
	void appStore() {
		System.out.println("App Store is available..!");
	}

}
