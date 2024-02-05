package com.control.statements;

public class IfTest {
		
	static void ifConditionExample(int a, int b) {
		if (a>b) {
			System.out.println("a is greater than b");
		}else if(a==b) {
			System.out.println("a is equal to b");
		}else {
			System.out.println("a is less than b");
		}
	}
	
	

	public static void main(String[] args) {
		ifConditionExample(10,20);
		ifConditionExample(30,20);
		ifConditionExample(10,10);
		
	}

}
