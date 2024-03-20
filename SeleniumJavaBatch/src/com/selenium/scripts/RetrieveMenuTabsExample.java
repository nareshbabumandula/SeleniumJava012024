package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RetrieveMenuTabsExample {

	WebDriver driver;

	@Test
	public void getMenuTabs() {
		List<WebElement> tabs = driver.findElements(By.xpath("//ul[contains(@class,'nav navbar-nav')]/li/a"));
		for (WebElement menutab : tabs) {
			System.out.println(menutab.getText());
		}
		
		List<WebElement> submenus = driver.findElements(By.xpath("//ul[contains(@class,'nav navbar-nav')]/li[@class=\"dropdown\"]/div/div/ul/li/a"));
		System.out.println("Sub menus listed here..!");
		for (WebElement submenu : submenus) {
			System.out.println(submenu.getText());
		}
	}

	@BeforeClass
	public void accessSite() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
