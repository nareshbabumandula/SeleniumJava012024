package step.definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import com.main.WebDriverSingleton;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StoreSearchPageDefinitions {
	
	WebDriverSingleton driver;
	
	@Given("I access eyeglassworld website")
	public void accessSite() {
		WebDriverManager.chromedriver().setup();
		driver.getDriver().get("https://www.eyeglassworld.com");
		driver.getDriver().manage().window().maximize();
		driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("Accessed eye glass world website");
	}
	
	@When("I search for a store based on {string} name")
	public void i_search_for_a_store_based_on_name(String string) {
		driver.getDriver().findElement(By.xpath("//input[@placeholder='City, State, or ZIP code']")).sendKeys(string);
		driver.getDriver().findElement(By.xpath("//button[contains(text(),'Find a Store')]")).click();
	    System.out.println("Searched an eye glass store based on city name");
	}
	
	@Then("I should see the appropriate results")
	public void verifySearchResults() {
		String actCity = driver.getDriver().findElement(By.xpath("//span[@class='nearyou']")).getText();
		
		if (actCity.contains("tampa")) {
			Hooks.getExtentTest().log(LogStatus.PASS, "City name is found in the search results heading");
			System.out.println("City name is found in the search results heading");
		} else {
			Hooks.getExtentTest().log(LogStatus.FAIL, "ity name is not found in the search results heading");
			System.out.println("ity name is not found in the search results heading");
		}
	}


}
