package extentReport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	ExtentReports report;
	ExtentTest test;
	
  @BeforeTest
  public void startTest() {
	  report=new ExtentReports(".\\ExtentReport\\extentReportwithfail.html");
	  report.addSystemInfo("User", "Namdev");
	  report.addSystemInfo("System", "Windows");
  }
  @Test
  public void test1() {
	 test= report.startTest("test1");
	  Assert.assertTrue(true);
	 // test.log(LogStatus.PASS, "Test1 is Passed");
  }
  @Test
  public void test2() {
	  test=report.startTest("test2");
	  Assert.assertTrue(false);
	 // test.log(LogStatus.FAIL, "Test is Fail");
  }
  
  @AfterMethod
  public void getResult(ITestResult result) {
	  if(result.getStatus()==ITestResult.SUCCESS) {
		  test.log(LogStatus.PASS, "Test is Passed"+result.getName());
	  }else if(result.getStatus()==ITestResult.FAILURE) {
		  test.log(LogStatus.FAIL, "Test  is Failed"+result.getName());
		  test.log(LogStatus.FAIL, "Test is Failed due to "+result.getThrowable());
	  }else {
		  test.log(LogStatus.SKIP, "Test is skipped "+result.getName());
	  }
	  report.endTest(test);
  }
  
  @AfterTest
  public void endtest() {
	  report.flush();
	  report.close();
  }
  
  
  
}
