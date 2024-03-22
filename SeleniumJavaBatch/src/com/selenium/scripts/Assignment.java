package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples/basiccontact.php");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/input")).sendKeys("Rajan");
		Thread.sleep(3000);
		driver.quit();
	}

}
