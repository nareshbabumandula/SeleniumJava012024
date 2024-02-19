package com.selenium.scripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilties.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	static WebDriver driver;
		
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(20000);
		List<WebElement> menus = driver.findElements(By.xpath("//div[@id='nav-xshop']/child::a"));
		System.out.println("No of tabs displayed are : " + menus.size());
		
		for (WebElement menu : menus) {
			System.out.println(menu.getText());
		}
		
		driver.quit();
	}

}
