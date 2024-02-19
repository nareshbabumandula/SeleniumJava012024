package com.selenium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.object.repository.Homepage;
import com.object.repository.SampleFormspage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectModelImplTest {

	static WebDriver driver;
	static Homepage hp;
	static SampleFormspage sp;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		
		// Selenium WebDriver code without using page object model
		//driver.findElement(By.linkText("Sample Forms")).click();
		
		// Selenium WebDriver code with using page object model
		driver.findElement(hp.sampleForms).click();
		driver.findElement(sp.sendTo).click();
		driver.findElement(sp.subject).sendKeys("Test Subject..!");
		driver.findElement(sp.email).sendKeys("sneha@gmail.com");
		driver.findElement(sp.textboxField).sendKeys("Test Textbox");
		Thread.sleep(3000);
		driver.quit();
	}

}
