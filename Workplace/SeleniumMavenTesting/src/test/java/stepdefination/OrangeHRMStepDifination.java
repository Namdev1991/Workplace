package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;
import webPages.EmployeeListPage;
import webPages.OrangeHRMLoginpage;

public class OrangeHRMStepDifination extends SeleniumUtility {
	WebDriver driver;

	@Given("^Browser is Launch and Login Page is Open$")
	public void BrowserandUrl() {
		driver = setUp("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	OrangeHRMLoginpage Lpage;
	@When("^User Enter (.+) as a Username and (.+) as a password$")
	public void EnterUsernameandPassword(String un,String pw) {
		Lpage=new OrangeHRMLoginpage(driver);
		Lpage.Login(un,pw);
	}
	@And("^click on Login Btn$")
	public void click() throws InterruptedException{
		Lpage.clickonbutton();
		Thread.sleep(2000);
	}
	@Then("^User should be on login page$")
	public void Validation() {
		Assert.assertTrue(Lpage.validation());
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
	}
	EmployeeListPage empage;
	@When("^User Enter details$")
	public void EnterDetails() {
		empage=new EmployeeListPage(driver);
		empage.search();
	}
	
	@Then("^Validate record found or not$")
	public void validate(){
		empage.validation();
	}
	@And("^close the orangeHRMBrowser$")
	public void quit() {
		driver.close();
	}
}
