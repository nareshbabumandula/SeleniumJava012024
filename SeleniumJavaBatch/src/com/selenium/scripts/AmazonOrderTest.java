package com.selenium.scripts;

import org.testng.Assert;
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
	
	@BeforeTest(groups = {"smoke"})
	void login() {
		System.out.println("logged in to the amazon application");
	}
	@BeforeClass(groups = {"smoke"})
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
	
	@Test(priority = 1, groups = {"smoke"}, invocationCount = 4)
	void addToCart() {
		Assert.assertEquals(true, true);
		System.out.println("added the product to the cart");
	}
	@Test(priority = 3, enabled = false)
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
	@Test(priority = 2, groups = {"smoke"}, dependsOnMethods = {"addToCart"}, alwaysRun = true)
	void checkOut() {
		System.out.println("checked out the product");
	}
		
	@AfterClass
	void viewReceipt() {
		System.out.println("viewed the receipt");
	}
	
	@AfterTest(groups = {"smoke"})
	void logout() {
		System.out.println("logged out from the application");
	}

	
}
