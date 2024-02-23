package com.selenium.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonOrderTest {

	@BeforeSuite
	void accessSite() {
		System.out.println("Accessed amazon site");
	}
	@BeforeTest
	void login() {
		System.out.println("loggged in to the amazon application");
	}
	@BeforeClass
	void searchProduct() {
		System.out.println("searched the product");
	}
	
	@BeforeMethod
	void verifyProductStockAvailablity() {
		System.out.println("verified product stock availablility");
	}
	
	@AfterMethod
	void verifyProductQuality() {
		System.out.println("verified product quantity");
	}
	
	@Test(priority = 1)
	void addToCart() {
		System.out.println("added the product to the cart");
	}
	@Test(priority = 3)
	void selectDeliveryAddress() {
		System.out.println("selected the delivery address");
	}
	@Test(priority = 5)
	void placeOrder() {
		System.out.println("successfully placed the order");
	}
	@Test(priority = 4)
	void selectPaymentMode() {
		System.out.println("selected payment mode");
	}
	@Test(priority = 2)
	void checkOut() {
		System.out.println("checked out the product");
	}
		
	@AfterClass
	void viewReceipt() {
		System.out.println("viewed the receipt");
	}
	
	@AfterTest
	void logout() {
		System.out.println("logged out from the application");
	}
	
	@AfterSuite
	void closeBrowser() {
		System.out.println("closed the browser");
	}
	
	
}
