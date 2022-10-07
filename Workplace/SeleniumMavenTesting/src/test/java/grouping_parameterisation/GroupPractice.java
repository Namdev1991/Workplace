package grouping_parameterisation;

import org.testng.annotations.Test;

public class GroupPractice {
	
  @Test(groups= {"Smoke","Sanity"})
  public void First() {
  System.out.println("This is Method 1");
  }
  
  @Test(groups= {"Smoke","Regression"})
  public void Second() {
  System.out.println("This is Method 2");
  }
  
  @Test(groups= {"Smoke","Regression"})
  public void Third() {
  System.out.println("This is Method 3");
  }
  
  @Test(groups= {"Smoke","Sanity"})
  public void Fourth() {
  System.out.println("This is Method 4");
  }
  
  
  
  
  
}
