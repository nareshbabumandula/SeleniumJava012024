package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		
		// ID locator
		driver.findElement(By.id("user")).sendKeys("Pavithra");
		
		// Name locator
		driver.findElement(By.name("pass")).sendKeys("Secure*1234");
		
		// Class name locator
		driver.findElement(By.className("btn_log")).click();
		
		// CSS Selector locator
		driver.findElement(By.cssSelector("input[id='user']")).sendKeys("Praveen");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='user']")).clear();
		
		// CSS Selector with # as a replacement for ID attribute
		driver.findElement(By.cssSelector("input#user")).sendKeys("Rajan");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#user")).clear();
		
		// CSS Selector with . as a replacement for class attribute
		driver.findElement(By.cssSelector("input.txt_log")).sendKeys("Prashanth");
		
		// Linktext locator
		driver.findElement(By.linkText("Sample Forms")).click();
		driver.findElement(By.linkText("Home")).click();
		
		// Partial Linktext locator
		driver.findElement(By.partialLinkText("Sample")).click();
		driver.findElement(By.linkText("Home")).click();
		
		// tagname locator
		driver.findElement(By.tagName("input")).sendKeys("Yuvalakshmi");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).clear();
		
		// xpath locator
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Sneha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user']")).clear();
				
		driver.findElement(By.linkText("Sample Forms")).click();
		
		// Absolute xpath - starts from the root/parent node with a preceding single slash (/)
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr[2]/td/input")).sendKeys("Test Subject");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr[2]/td/input")).clear();
		
		// Relative xpath - Starts from the node of our choice with a preceding double slash (//)
		driver.findElement(By.xpath("//table/tbody/tr[2]/td/input")).sendKeys("Test Subject123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table/tbody/tr[2]/td/input")).clear();
		Thread.sleep(4000);
		driver.quit();
	}

}
