package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class AssertionsUse {
  @Test
  public void Method(){
	  SeleniumUtility s1=new SeleniumUtility();
	  WebDriver driver=s1.setUp("Chrome", "https://opensource-demo.orangehrmlive.com/");
	  String currenttitle=s1.getPageTitle();
	  //1
	  Assert.assertEquals(currenttitle, "OrangeHRM1");// we used Hard Assertion here so if this is fail then whole program get terminate 
	  //at this line and browser will not close to do so we have to do soft Assertion.
	  
	  //2
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).isDisplayed());
	  driver.close();
  
  }
}
