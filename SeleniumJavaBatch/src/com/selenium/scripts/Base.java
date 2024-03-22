package com.selenium.scripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	@BeforeSuite(groups = {"smoke"})
	void accessSite() {
		System.out.println("Accessed amazon site");
	}
	
	@AfterSuite(groups = {"smoke"})
	void closeBrowser() {
		System.out.println("closed the browser");
	}

}
