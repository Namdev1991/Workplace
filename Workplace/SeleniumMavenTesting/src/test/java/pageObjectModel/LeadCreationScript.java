package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.SeleniumUtility;
import webPages.HomePageVtiger;
import webPages.LeadCreationPage;
import webPages.LoginPageofVtiger;

public class LeadCreationScript extends SeleniumUtility {

	WebDriver driver;
	ExtentReports report;
	ExtentTest test;

	@BeforeTest
	public void PreRequisite() {
		report= new ExtentReports(".\\ExtentReport\\VtigerAfterLeadCreation.html");
		driver = setUp("Chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		LoginPageofVtiger ref1 = new LoginPageofVtiger(driver);
		HomePageVtiger ref2 = new HomePageVtiger(driver);
		ref1.Login("admin", "Test@123");
		ref1.waitfor(5);
		ref2.navigatetoleadpage();
		
	}

	@Test
	public void LeadCreation() throws InterruptedException {
		test=report.startTest("Lead Creation");
		LeadCreationPage ref3=new LeadCreationPage(driver);
		ref3.Leadcreation("Namdev", "Tarange", "9970342871");
		Assert.assertTrue(ref3.nameValidate());
	}
	@Test
	public void leaddelete() {
		test=report.startTest("Lead Delete");
		LeadCreationPage ref3=new LeadCreationPage(driver);
		ref3.leadDelete();
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {	
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(LogStatus.PASS,test.addScreenCapture(Screenshot(driver,"LeadCreateordelete")));
		}else {
			test.log(LogStatus.FAIL,test.addScreenCapture(Screenshot(driver,"LeadCreateordelete")));
		}
		report.endTest(test);
	}
	
	@AfterTest
	public void ending() {
			report.flush();
			report.close();
			driver.close();
	}

	
}
