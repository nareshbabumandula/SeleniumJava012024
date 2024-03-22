package com.java.basics;

public class StringMethods {

	public static void main(String[] args) {
		// Syntax 1: Defining a String
		String sText = "pavithra";
		System.out.println(sText.toUpperCase());
		System.out.println(sText.length());
		System.out.println(sText.hashCode());
		System.out.println(sText.charAt(0));
		
		// Syntax 2: Defining a String by creating an object reference for a String class
		String str = new String("SNEHA");
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.hashCode());
		
		String s = "hello";
		System.out.println(s.hashCode());
		String st = "HELLO";
		System.out.println(st.hashCode());
		System.out.println(s==st);
		String s1 = "hello";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s==s1); // Address comparison
		String s2 = new String("hello");
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s.equals(s2)); // Value comparison
		
		String strText = "                  welcome to java training              ";
		System.out.println(strText);
		System.out.println(strText.trim());
	}

}
