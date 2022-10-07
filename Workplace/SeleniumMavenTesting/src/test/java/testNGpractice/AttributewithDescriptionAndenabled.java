package testNGpractice;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class AttributewithDescriptionAndenabled {
  @Test(enabled=true)
  public void method1() {
	  System.out.println("Method1 is Executed");  
  }
  @Test(description="this is method2")
  public void method2() {
	  throw new SkipException("Method2 is Skipped");
	 
  }
//  @Test(priority=0)
  @Test(description= "This is Method 3")
  public void test1() {
	  System.out.println("Test1 is Executed");
	  int i=10/0;
  }
  
  @Test
  public void test() {
	  System.out.println("Method3 is Executed");
	  int i=10/0;
	 
  }
}
