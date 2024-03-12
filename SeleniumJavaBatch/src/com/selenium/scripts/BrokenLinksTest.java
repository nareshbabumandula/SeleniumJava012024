package com.selenium.scripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // first window
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links) {
			if (link.getAttribute("href")!=null) {
				System.out.println(link.getText());
			} else {
				System.out.println(link.getText() + " is a broken link");
			}
		}
		
		driver.quit();

	}

}
