package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.SeleniumUtility;
import webPages.LoginPageofVtiger;

public class LoginVtigerScript extends SeleniumUtility {
	ExtentReports report;
	ExtentTest test;
	
	@BeforeMethod
	public void Starttest() {
		report=new ExtentReports(".\\ExtentReport\\VtigerwithPOMSS.html");
		test=report.startTest("LoginPage");
	}
	
  @Test
  public void LoginonVtiger() throws InterruptedException {
	  //Start the Browser and hit the Url
	  WebDriver driver=setUp("Chrome","https://demo.vtiger.com/vtigercrm/index.php");
	  
	  //Create Instance of Loginpage for Accessing the WebElements
	  LoginPageofVtiger ref1=new LoginPageofVtiger(driver);
	  //By using Method in page login to the page
	  //ref1.Logintopage("admin", "Test@123");
	  ref1.Login("admin", "Test@123");
	  ref1.waitfor(5);
	  
	  if(driver.getTitle().equals("Dashboard")) {
		  test.log(LogStatus.PASS,test.addScreenCapture(Screenshot(driver,"VtigerHomePom")), "Home Page Title Verified");
	  }else {
		  test.log(LogStatus.FAIL,test.addScreenCapture(Screenshot(driver,"VtigerHome")) ,"Home Page Title is Not Matched");
	  }
	  
	 
	  }
  @AfterMethod
  public void EndTest() {
	report.endTest(test);
	report.flush();
	report.close();
  }
  
}
