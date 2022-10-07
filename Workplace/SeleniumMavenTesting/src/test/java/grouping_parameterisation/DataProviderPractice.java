package grouping_parameterisation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class DataProviderPractice extends SeleniumUtility {
	WebDriver driver;

	//@Test(dataProvider = "getData")
	@Test (dataProvider="testData")
	public void Login(String browser,String url,String username, String pwd) {
		driver = setUp(browser, url);
		
	}

	//Data Provider By One Type
	
//	@DataProvider
//	public String[][] getData() {
//		String[][] loginData = { { "Admin", "admin123" }, { "Admin123", "admin" }, { "Admin101", "admin" } };
//		return loginData;
//	}
	
	//Data Provider By 2nd Type
	@DataProvider(name="testData")
	public String[][] getData() {
		String[][] loginData = { {"chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login","Admin", "admin123" }, 
								{"firefox","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "Admin123", "admin" },
								{"chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login","Admin101", "admin" } };
		return loginData;
	}
}
