package com.java.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treemap = new TreeMap<>();
		treemap.put(1, "Ravi");
		treemap.put(2, "Ram");
		treemap.put(3, "Praveen");
		treemap.put(4, "Prashanth");
		treemap.put(5, "Pavithra");
		treemap.put(1, "Rajan");
		//treemap.put(null, "Sneha");
		
		System.out.println(treemap.entrySet());
		System.out.println(treemap.keySet());
		System.out.println(treemap.values());
		
		for (Map.Entry entry : treemap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	

	}

}
