package testNGpractice;

import org.testng.annotations.Test;

public class AttributeTimeout {
  @Test(timeOut=2000)
  public void testCase1() throws InterruptedException {
	  Thread.sleep(5000);
  }
  @Test
  public void testCase2() {
	  System.out.println("testCase2");
  }
  @Test
  public void testCase3() {
	  System.out.println("testCase3");
  }

}

