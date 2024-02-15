package com.exceptions;

public class UncheckedExceptionsTest {
	/**
	 * Exception: It is an interruption to the execution due to which the normal flow of the code will be disrupted
	 * Exception handling: Its a mechanism of handling the exception such that the normal flow of the execution will remain safe
	 */
	void uncheckedExceptionsExample() {
		boolean bflag=false;
		try {
			String str="hello";
			System.out.println(str.length());
			int a=10;
			int b=0;
			int c=a/b; // Here the exception is going to occur at run-time hence this exception is called as unchecked or run-time expeption
			System.out.println("Division output of a and b is : " +c);
			int[] marks = {10,20,60,55};
			System.out.println(marks[0]);
			System.out.println(marks[1]);
			System.out.println(marks[3]);
			System.out.println(marks[2]);
			bflag=true;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException catch block..!");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException catch block..!");
			e.printStackTrace();
		} catch (RuntimeException e) {
			System.out.println("RuntimeException catch block..!");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Exception catch block..!");
		}finally {
			if (bflag) {
				System.out.println("No exception occured..!");
			} else {
				System.out.println("Exception occured..!");
			}
		}
	}
	
	

	public static void main(String[] args) {
		UncheckedExceptionsTest ucet = new UncheckedExceptionsTest();
		ucet.uncheckedExceptionsExample();

	}

}
