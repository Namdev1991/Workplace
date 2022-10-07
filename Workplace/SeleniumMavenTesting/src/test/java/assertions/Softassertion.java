package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.SeleniumUtility;

public class Softassertion {
  @Test
  public void OrangeHRM() {
	  SeleniumUtility s1=new SeleniumUtility();
		 SoftAssert sas=new SoftAssert(); //------> Create Instance of SoftAssert 
	
		  WebDriver driver=s1.setUp("Chrome", "https://opensource-demo.orangehrmlive.com/");
		  String currenttitle=s1.getPageTitle();
		  //1
		  sas.assertEquals(currenttitle, "OrangeHRM1");
		  
		  //2
		  sas.assertTrue(driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).isDisplayed());
		  
		  driver.close();
		  //Report the Failure
		  sas.assertAll();
		
  }
}
