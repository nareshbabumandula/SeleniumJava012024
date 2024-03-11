package com.selenium.scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindowsTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		
		WebElement sampleForms = driver.findElement(By.linkText("Sample Forms"));
		String s = Keys.chord(Keys.CONTROL, Keys.RETURN);
		sampleForms.sendKeys(s);
		WebElement features = driver.findElement(By.linkText("Features"));
		sampleForms.sendKeys(s);
		String mainWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(mainWindow);
		System.out.println(windows);
		Thread.sleep(3000);
		driver.quit();

	}

}
