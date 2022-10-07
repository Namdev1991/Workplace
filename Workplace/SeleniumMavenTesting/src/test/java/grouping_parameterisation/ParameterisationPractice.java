package grouping_parameterisation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class ParameterisationPractice extends SeleniumUtility {
	WebDriver driver;
	@Parameters({"browser","url","username","pwd"})
	@Test
  public void Login(String browser,String url,String username,String pwd) throws InterruptedException {
		driver=setUp(browser,url);
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type=\"password\"and @name=\"password\"]")));
		WebElement user=driver.switchTo().activeElement();
		user.sendKeys(username,Keys.TAB);
		driver.switchTo().activeElement().sendKeys(pwd,Keys.ENTER);
		
  }
}
