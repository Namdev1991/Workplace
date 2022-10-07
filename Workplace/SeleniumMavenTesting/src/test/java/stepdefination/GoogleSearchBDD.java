package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class GoogleSearchBDD extends SeleniumUtility {

	WebDriver driver;
	@Given("^User already on Google Search Page$")
	public void user_already_on_google_search_page() {
		driver=setUp("Chrome","https://www.google.com/");
	}

	@When("^Types Interview (.+)$")
	public void types_interview_something(String text)  {
		driver.findElement(By.name("q")).sendKeys(text,Keys.ENTER);
		
	}

	@Then("^It should get result related to (.+)$")
	public void it_should_get_result_related_to_something(String text) {
		Assert.assertTrue(driver.getTitle().contains(text)); 
	}

	@And("^Close the browser$")
	public void close_the_browser() {
		driver.close();
	}

}
