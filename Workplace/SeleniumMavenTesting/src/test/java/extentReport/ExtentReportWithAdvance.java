package extentReport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.SeleniumUtility;

public class ExtentReportWithAdvance extends SeleniumUtility {
	ExtentReports report;
	ExtentTest test;

	@BeforeTest
	public void set() {
		report = new ExtentReports(".\\ExtentReport\\Advance.html");
		report.addSystemInfo("User", "Namdev");
		report.addSystemInfo("System", "Windows");
	}

	@Test
	public void Testcase1() {
		test = report.startTest("TestCase1");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test Case is Passed");
	}

	@Test
	public void Testcase2() {
		test = report.startTest("TestCase2");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Test Case is Failed");
	}

	@Test
	public void Testcase3() {
		test = report.startTest("TestCase3");
		throw new SkipException("Test is Skipped due to Test is not ready");
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, "Test case is Passed " + result.getName());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "Test Case is Failed " + result.getName());
			test.log(LogStatus.FAIL, "Test Case is Failed due to " + result.getThrowable());
		} else {
			test.log(LogStatus.SKIP, "Test Case is Skipped " + result.getName());
		}
		report.endTest(test);
	}

	@AfterTest
	public void close() {
		report.flush();
		report.close();
	}
}