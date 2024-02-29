package com.java.basics;

public class Singleton{
	
	private static Singleton instance;
	
	public static Singleton getInstance() {
		// Lazy initialization : create the instance only if it doesn't exist
		if (instance==null) {
			instance = new Singleton();
		}	
		return instance;
	}
	
	// private constructor
	private Singleton(){
		
	}
	
	public static void main(String[] args) {
		
	}

}

class SingetonDemo{
	
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
