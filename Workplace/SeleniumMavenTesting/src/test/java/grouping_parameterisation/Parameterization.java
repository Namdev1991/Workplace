package grouping_parameterisation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class Parameterization extends SeleniumUtility {
	
	WebDriver driver;
	@Parameters({ "browser", "url", "username", "pwd" })
	@Test
	public void Login(String browser, String url, String username, String pwd) throws InterruptedException {
		 driver=setUp(browser,url);
		 WebElement user=driver.switchTo().activeElement();
		 user.sendKeys(Keys.TAB);
		 WebElement pw=driver.switchTo().activeElement();
		 pw.sendKeys(Keys.ENTER);
		 Thread.sleep(5000);
		 driver.close();
		 
	}
}
