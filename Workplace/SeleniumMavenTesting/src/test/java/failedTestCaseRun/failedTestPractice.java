package failedTestCaseRun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class failedTestPractice {
	
  @Test(retryAnalyzer=RetryAnalyzer.class)
  public void TestCase1() {
	  Assert.assertTrue(false);
  }
  
  @Test(retryAnalyzer=RetryAnalyzer.class)
  public void TestCase2() {
	  Assert.assertTrue(false);
  }
  
  @Test
  public void TestCase3() {
	  Assert.assertTrue(true);
  }
}
