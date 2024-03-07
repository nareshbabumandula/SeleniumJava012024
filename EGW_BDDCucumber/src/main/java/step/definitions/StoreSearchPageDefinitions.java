package step.definitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import com.main.Base;
import com.page.objects.SearchPage;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StoreSearchPageDefinitions {
	SearchPage sp;	
	
	@Given("I access eyeglassworld website")
	public void accessSite() {
		WebDriverManager.chromedriver().setup();
		Base.getDriver().get("https://www.eyeglassworld.com");
		Base.getDriver().manage().window().maximize();
		Base.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Accessed eye glass world website");
	}

	@When("I search for a store based on {string} name")
	public void storeSearch(String string) {
		Base.getDriver().findElement(By.xpath("//input[@placeholder='City, State, or ZIP code']")).sendKeys(string);
		Base.getDriver().findElement(By.xpath("//button[contains(text(),'Find a Store')]")).click();
		System.out.println("Searched an eye glass store based on city/state/zipcode : " + string);
		Hooks.getExtentTest().log(LogStatus.PASS, "Searched an eye glass store based on city/state/zipcode : " + string);
	}

	@Then("I should see the appropriate results with city\\/state\\/zipcode {string}")
	public void verifySearchResults(String cityStateZip) {
		try {
			String actCityStateZip = Base.getDriver().findElement(By.xpath("//span[@class='nearyou']")).getText();

			if (actCityStateZip.contains(cityStateZip)) {
				Hooks.getExtentTest().log(LogStatus.PASS, "City/State/Zipcode name is found in the search results heading");
				System.out.println("City/State/Zipcode is found in the search results heading");
			}else {
				Hooks.getExtentTest().log(LogStatus.FAIL, "City/State/Zipcode name is not found in the search results heading");
				System.out.println("City/State/Zipcode is not found in the search results heading");
			}
			// Initialize page factory elements
			sp = new SearchPage(Base.getDriver());
					
			if (sp.storeClosed.size()>0) {
				System.out.println("Store is closed..!");
				Hooks.getExtentTest().log(LogStatus.PASS, "Store status is displayed as closed");
			}
			
			if (sp.storeOpen.size()>0) {
				System.out.println("Store is opened..!");
				Hooks.getExtentTest().log(LogStatus.PASS, "Store status is displayed as open");
			}
			
		} catch (Exception e) {
			Hooks.getExtentTest().log(LogStatus.FAIL, "City/State/Zipcode name is not found in the search results heading");
			System.out.println("City/State/Zipcode is not found in the search results heading");
			e.printStackTrace();
		}
	}

	@When("I search for a store based on city\\/state\\/zipcode")
	public void i_search_for_a_store_based_on_city_state_zipcode(io.cucumber.datatable.DataTable dataTable) {
		List<String> data = dataTable.asList();

		for (String citystatezipcode : data) {
			try {
				Base.getDriver().findElement(By.xpath("//input[@placeholder='City, State, or ZIP code']")).sendKeys(citystatezipcode);
				Base.getDriver().findElement(By.xpath("//button[contains(text(),'Find a Store')]")).click();
				System.out.println("Searched an eye glass store based on city/state/zipcode : " + citystatezipcode);
				Hooks.getExtentTest().log(LogStatus.PASS, "Searched an eye glass store based on city/state/zipcode : " + citystatezipcode);
			} catch (Exception e) {
				Hooks.getExtentTest().log(LogStatus.FAIL, "Failed to enter City/State/Zipcode in the search field");
				System.out.println("Failed to enter City/State/Zipcode in the search field");
				e.printStackTrace();
			}finally {
				Base.getDriver().navigate().back(); // Browser navigate backward
				Base.getDriver().navigate().refresh(); // Refresh the browser
			}

		}

	}


}
