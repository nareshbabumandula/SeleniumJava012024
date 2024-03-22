package com.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionsTest {

	public void checkedExceptionThrowsExample() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("./files/Data.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;

		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		System.out.println("checkedExceptionThrowsExample method completed..!");
	}

	public void checkedExceptionTryCatchExample(){

		try {
			FileReader fr = new FileReader("./files/Data.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;

			while ((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("checkedExceptionTryCatchExample method completed..!");
	}

	public static void main(String[] args) throws IOException {
		CheckedExceptionsTest cet = new CheckedExceptionsTest();
		cet.checkedExceptionThrowsExample();
		cet.checkedExceptionTryCatchExample();

	}

}
