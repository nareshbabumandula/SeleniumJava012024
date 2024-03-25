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
		
		System.out.println(sText.charAt(0));
		System.out.println(sText.charAt(1));
		//System.out.println(sText.charAt(9)); // StringIndexOutOfBoundsException
		
		System.out.println("Retrieve each character from a string..!");
		for (int i = 0; i<=sText.length()-1; i++) {
			System.out.println(sText.charAt(i));
		}
		
		System.out.println("Retrieve each character from a string in a reverse order..!");
		System.out.println("Reverse a string..!");
		String rev="";
		for (int i = sText.length()-1; i>=0; i--) {
			rev+=sText.charAt(i);
		}
		System.out.println(rev);
		
		String str1 = "welcome to java sofware edition";
		System.out.println(str1.contains("java"));
		System.out.println(str1.contains("    JAVA    ".toLowerCase().trim()));
		
		System.out.println(str1.replace("java", "core java"));
		System.out.println(str1.concat(" course"));
		
	}

}
