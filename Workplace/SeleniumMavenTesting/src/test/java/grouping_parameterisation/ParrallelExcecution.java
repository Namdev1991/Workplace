package grouping_parameterisation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class ParrallelExcecution extends SeleniumUtility {
	
	@Parameters({"browser","username","pwd"})
	@Test
  public void Login(String browser,String username,String pwd) {
		if(browser.equalsIgnoreCase("chrome")) {
			setUp(browser,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}else if(browser.equalsIgnoreCase("firefox")) {
			setUp(browser,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type=\"password\"and @name=\"password\"]")));
		WebElement user = driver.switchTo().activeElement();
		user.sendKeys(username, Keys.TAB);
		driver.switchTo().activeElement().sendKeys(pwd, Keys.ENTER);

	}
}
