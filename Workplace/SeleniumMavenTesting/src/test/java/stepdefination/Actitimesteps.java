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
import webPages.ActitimeLoginPage;
import webPages.HomePageofActitime;
import webPages.TaskPage;

public class Actitimesteps extends SeleniumUtility {
	WebDriver driver;
	ActitimeLoginPage Lpage;

	@Given("^Browser is launch with correct Url$")
	public void Browser_Launching() {
		driver = setUp("Chrome", "https://demo.actitime.com/login.do");
	}

	@When("^User Login with Valid creadentials$")
	public void Login() {
		Lpage = new ActitimeLoginPage(driver);
		Lpage.Login("admin", "manager");
	}

	@Then("^User Should be on Home Page$")
	public void Validation_of_HomePage() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		// Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		Assert.assertTrue(driver.getTitle().contains("actiTIME - Enter Time-Track"));
	}

	@When("^User Login with Invalid creadentials$")
	public void InvalidLogin() {
		Lpage = new ActitimeLoginPage(driver);
		Lpage.Login("admin", "admin");
	}

	@Then("^User Should get Error Msg$")
	public void Error() {
		Assert.assertTrue(Lpage.ErrorValidation());
	}

	// HomePage Object
	HomePageofActitime hpage;
	@When("^User click on TaskButton$")
	public void navigatetoTaskpage() throws InterruptedException {
		hpage = new HomePageofActitime(driver);
		hpage.navigatetotaskcreation();
		Thread.sleep(5000);
	}

	// TaskPage Object
	TaskPage tpage;

	@Then("^It should be on TaskPage$")
	public void taskpagevalidate()  {
		tpage = new TaskPage(driver);
		Assert.assertTrue(driver.getTitle().contains("actiTIME - Task List"));
	}

	@When("^user create a task$")
	public void taskcreation() {
		tpage.taskCreate("play");
	}

	@Then("^Task should be created$")
	public void Validation() {
		Assert.assertTrue(tpage.Validationofcreatedtask());
	}

	@When("^user Dalete task$")
	public void delete() {
		tpage.taskdelete();
	}

	@Then("^Task should be Delete$")
	public void deletevalid() {
		Assert.assertFalse(tpage.deleteValidation());
	}

	@And("^close Browser$")
	public void close() {
		driver.close();
	}
}
