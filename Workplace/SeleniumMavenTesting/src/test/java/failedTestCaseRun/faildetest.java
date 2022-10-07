package failedTestCaseRun;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class faildetest extends SeleniumUtility{
	
	
	
  @Test
  public void TestCase1() {
	  Assert.assertTrue(false);
  }
  
  @Test
  public void TestCase2() {
	  Assert.assertTrue(true);
  }
}
