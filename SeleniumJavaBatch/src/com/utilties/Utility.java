package com.utilties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	
	public static String readProperty(String propertyName) throws IOException {
		String filepath = "./application.properties";
		FileReader fr = new FileReader(filepath);
		Properties prop = new Properties();
		prop.load(fr);
		String value = prop.getProperty(propertyName);
		
		return value;
	}
	
	
	

}
