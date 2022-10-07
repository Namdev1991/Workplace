package failedTestCaseRun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer1 implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {
		int counter=0;
		int maximumLimit=2;
		if(counter<maximumLimit) {
			counter++;
			return true;
		}
		return false;
	}
  
 
}
