package com.java.basics;

public class MethodsTest {
	
	// Method : It is a block of code which is created for re-using it else where
	// Return type: Void - Nothing will be returned from this method 
	// Method without argument and without return type
	void accessSite() {
		System.out.println("Accessed Amazon site");
	}

	// Method without argument and with return type
	boolean login() {
		System.out.println("Successfully logged into Amazon site");
		return true;
	}

	// Method with argument and without return type
	void searchProduct(String product) {
		System.out.println("Searched the product : " + product);
	}

	// Method with arguments and with return type
	int addToCart(String product, int quanity) {
		System.out.println("Successfully added the product '" +product+ "' to the cart with quantity as : " + quanity);
		return quanity;
	}

	
	public static void main(String[] args) {
		MethodsTest mt = new MethodsTest();
		mt.accessSite();
		boolean bflag = mt.login();
		System.out.println(bflag);
		mt.searchProduct("iphone");
		int quantity = mt.addToCart("iphone", 2);
		System.out.println(quantity);
	}

}
