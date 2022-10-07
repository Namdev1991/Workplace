package testAnnotations;

import utility.SeleniumUtility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsUse extends SeleniumUtility{
 
	WebDriver driver;
	@BeforeTest
  public void start() {
		driver=setUp("chrome","https://www.google.com/");
  }
	@Test
	public void TitleValidation() {
		String expectedTitle="Google";
		String currentTitle=getPageTitle();
		Assert.assertEquals(currentTitle, expectedTitle);
	}
	@Test
	public void testSearch() {
		driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
		Assert.assertTrue(getPageTitle().contains("SQL"));
	}
	@AfterTest
	public void cleanUp() {
		tearDown();
	}
}
