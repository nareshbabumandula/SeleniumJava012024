package com.java.basics;

public class DataTypes {

	public static void main(String[] args) {
		// Java is a statically typed dynamic programming language
		// In java data type checking happens during compilation hence java is a statically typed language
		//Primitive data types - byte, short, int, long, float, double, boolean & char
		byte b=125;
		short s= 32723;
		int i = 986783;
		long l = 54667;
		float f =23.3f;
		double d = 523.23525;
		boolean bflag = true;
		char c='a';
		
		System.out.println("byte value is : " + b);
		System.out.println("short value is :" + s);
		System.out.println("int value is :" + i);
		System.out.println("long value is :" + l);
		System.out.println("float value is :" + f);
		System.out.println("double value is :" + d);
		System.out.println("boolean" + bflag);
		System.out.println("char value is :" + c);
		
		/*
		 * Casting : Converting
		 * Type casting : Converting one type of data to another type (byte to short)
		 * Widening/Implicit Casting: Converting smaller data type to a bigger data type (e.g. byte to short)
		 * Narrowing/Explicit Casting: Converting bigger data type to a smaller data type (e.g. short to byte)
		 */		
		byte b1 = 99;
		short s1 = b1;
		System.out.println(b1 + " " + s1);
		
		short s2=130;
		byte b2=(byte) s2;
		System.out.println(b2);
		
		// Non primitive data types ---> String, Array etc
		String str = "prashanth";
		String sText = "Jayaa";
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.length());
		System.out.println(str + " " + sText);
		
		// Array - Collection of similar data types
		int[] marks = {40,50,80,90,65};
		System.out.println(marks.length);
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		String[] names = {"praveen", "sneha", "yuvalakshmi", "prashanth", "rajan", "pavithra", "krisna"};
		System.out.println(names.length);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);

	}

}
