package com.java.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		/*
		 * 1. Array is always fixed in nature (we can't increase or decrease the size of an
		 * array once defined)
		 * 2. Array takes only primitives but not object types
		 * 3. Array maintains the insertion order based in index
		 */
		int[] marks = {10,60,80,90,25};
		boolean[] flags = {true, false, true, true, false};
		double[] score = {10.6,60.56,80.56,90.456,25.65654};
		System.out.println(marks.length);
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		//marks[5]=95;
		//System.out.println(marks[5]);
			
		/**
		 * The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
		 * Java Collections can achieve all the operations that you perform on a data such as searching, sorting, 
		 * insertion, manipulation, and deletion.
		 * 1. ArrayList is a class which implements List interface
		 * 2. ArrayList maintains insertion order
		 */
		 ArrayList alist = new ArrayList();
		 alist.add(10);
		 alist.add(60);
		 alist.add(80);
		 alist.add(90);
		 alist.add(25);
		 alist.add(null);
		 alist.add(null);
		 
		 System.out.println(alist);
		 System.out.println(alist.size());
		 alist.remove(0);
		 System.out.println(alist);
		
		

	}

}
