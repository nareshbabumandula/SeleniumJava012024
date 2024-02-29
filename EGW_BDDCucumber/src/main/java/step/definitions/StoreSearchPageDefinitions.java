package step.definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StoreSearchPageDefinitions {
	
	WebDriver driver;
	
	@Given("I access eyeglassworld website")
	public void accessSite() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.eyeglassworld.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("Accessed eye glass world website");
	}
	
	@When("I search for a store based on {string} name")
	public void i_search_for_a_store_based_on_name(String string) {
		driver.findElement(By.xpath("//input[@placeholder='City, State, or ZIP code']")).sendKeys(string);
		driver.findElement(By.xpath("//button[contains(text(),'Find a Store')]")).click();
	    System.out.println("Searched an eye glass store based on city name");
	}
	
	@Then("I should see the appropriate results")
	public void verifySearchResults() {
		String actCity = driver.findElement(By.xpath("//span[@class='nearyou']")).getText();
		if (actCity.equals("tampa")) {
			System.out.println("City name is found in the search results heading");
		} else {
			System.out.println("City name is not found in the search results heading");
		}
		driver.quit();
	}


}
