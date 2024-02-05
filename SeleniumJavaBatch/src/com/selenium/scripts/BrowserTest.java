package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	WebDriver driver;
	
	void accessSite(String browser) {
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser");
			break;
		}
				
		driver.get("https://www.eyeglassworld.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("inputStoreValue")).sendKeys("Tampa");
		driver.findElement(By.xpath("//button[@class='a-btn a-btn--primary  a-btn--is-slim m-store-finder__submit']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	

	public static void main(String[] args) throws InterruptedException {
		BrowserTest bt = new BrowserTest();
		bt.accessSite("edge");
		bt.closeBrowser();
	}

}
