package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
		 * 3. ArrayList does not having sorting
		 * 4. ArrayList accepts duplicate elements
		 * 5. ArrayList is preferred when we don't have manipulations, just store and retrieve
		 */
		ArrayList alist = new ArrayList();
		alist.add(10);
		alist.add(60);
		alist.add(80);
		alist.add(90);
		alist.add(25);
		alist.add(80);
		alist.add(null);
		alist.add(null);

		System.out.println(alist);
		System.out.println(alist.size());
		alist.remove(0);
		System.out.println(alist);

		ArrayList arrList = new ArrayList();
		arrList.add("Pavithra");
		arrList.add("Rajan");
		arrList.add("Prashanth");
		arrList.add("Sneha");
		arrList.add("Praveen");
		arrList.add("Yuvalakshmi");
		arrList.add("Naresh");
		//arrList.add(100);
		System.out.println("Iterator Started..!");
		Iterator<String> iter = arrList.iterator();

		while (iter.hasNext()) {
			String string = (String) iter.next();
			System.out.println("Value is : "+ string);
		}
		
		System.out.println("For each loop Started..!");
		for (Object object : arrList) {
			System.out.println("Value retrieved via foreach loop is : " +object);
		}
		
		System.out.println("For loop Started..!");
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("Value retrieved via for loop is : " +arrList.get(i));
		}
		
		System.out.println("Lambda expression Started..!");
		arrList.forEach(student->System.out.println("Value retrieved via lambda is : " + student));
		
		System.out.println(arrList.size());
		System.out.println(arrList.contains("Prashanth"));
		System.out.println(arrList.contains("praveen"));
		System.out.println(arrList);
		arrList.remove("Yuvalakshmi");
		System.out.println(arrList.get(0));
		System.out.println(arrList.isEmpty());
		System.out.println(arrList.set(0, "Prashanthi"));

		alist.addAll(arrList);
		System.out.println(alist);

		// Declaring an ArrayList with type safety
		ArrayList<String> arrList1 = new ArrayList<String>();

		List list1 = new ArrayList(); // upcasting -> Converting sub type to its immediate super type
		ArrayList alist3 = (ArrayList)list1; // Converting supertype to its immediate subtype
		//List list2 = new List(); not possible since List is an interface
		
		Set<String> set = new TreeSet<>();
		set.addAll(arrList);
		System.out.println(set);
	
		
	}

}
