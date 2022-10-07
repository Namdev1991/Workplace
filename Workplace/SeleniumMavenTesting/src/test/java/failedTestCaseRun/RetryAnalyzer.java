package failedTestCaseRun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	// counter of Retry Analyzer
	int counter = 0;
	// max Limit
	int SetMaxLimitofRetry = 3;

	// Retry method
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (counter < SetMaxLimitofRetry) {
			counter++;
			return true;
		}
		return false;
	}

}
