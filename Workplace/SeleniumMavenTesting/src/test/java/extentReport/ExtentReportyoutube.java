package extentReport;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.SeleniumUtility;

public class ExtentReportyoutube extends SeleniumUtility {

	static ExtentReports report;
	static ExtentTest test;

	@BeforeTest
	public void set() {
		report = new ExtentReports(".\\ExtentReport\\VTiger.html");
		test = report.startTest("VtigerHomePage");
	}

	@Test
	public void VtigerLogin() throws IOException {
		WebDriver driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("Test@123", Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#menubar_quickCreate")));
		if (getPageTitle().equals("Dashboard")) {
			// Here Sceenshot Method is called From Another Class
			test.log(LogStatus.PASS, test.addScreenCapture(extentReportPractice.screenShot(driver)));
		} else {
			test.log(LogStatus.FAIL, test.addScreenCapture(extentReportPractice.screenShot(driver)));
		}

		tearDown();
	}

	@AfterTest
	public void close() {
		report.endTest(test);
		report.flush();
	}

}
