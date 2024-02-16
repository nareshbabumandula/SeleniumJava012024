package com.exceptions;

public class CustomExceptionTest {
	
	void castVote(int age) throws InvalidAgeException {
		if (age>=18) {
			System.out.println("Voter can cast his/her vote since the age is : " + age);
		} else {
			String errorMsg = "Voter can't cast his/her vote since the age less than 18";
			throw new InvalidAgeException(errorMsg); // throw user defined exception
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		CustomExceptionTest cet = new CustomExceptionTest();
		cet.castVote(17);

	}

}
