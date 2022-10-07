package extentReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.SeleniumUtility;

public class extentReportPractice extends SeleniumUtility {
	private static final String errflpath = null;
	static ExtentReports report;
	static ExtentTest test;
	WebDriver driver;

	@BeforeClass
	public void startTest() {
		report = new ExtentReports(".\\ExtentReport\\OrangeHRM.html");
		test = report.startTest("OrangeHomePage");
	}

	@Test
	public void Actualcode() throws IOException {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@name=\"username\" and @placeholder=\"Username\"]")));
		if (getPageTitle().equals("OrangeHRM")) {
			test.log(LogStatus.PASS, test.addScreenCapture(screenShot(driver)));
		} else {
			test.log(LogStatus.FAIL, test.addScreenCapture(screenShot(driver)), "Test Case Is Failed");
		}
		tearDown();
	}

	@AfterClass
	public void EndTest() {
		report.endTest(test);
		report.flush();
	}

	public static String screenShot(WebDriver driver) throws IOException {
		// File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File Dest = new File(".\\Screenshots\\" + System.currentTimeMillis() + ".png");
		FileUtils.copyFile(srcFile, Dest);
		String absoluepath = Dest.getAbsolutePath();
		return absoluepath;

	}
}
