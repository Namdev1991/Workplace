package grouping_parameterisation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class DataProvider12 extends SeleniumUtility {
  @Test(dataProvider="getData")
  public void Logion(String browser,String Url,String Username,String pwd) {
	  WebDriver driver=setUp(browser,Url);
	  WebDriverWait wait=new WebDriverWait(driver,5);
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name=\"username\"and @placeholder=\"Username\"]"))));
	  WebElement user=driver.switchTo().activeElement();
	  user.sendKeys(Username,Keys.TAB);
	  WebElement pw=driver.switchTo().activeElement();
	  pw.sendKeys(pwd,Keys.ENTER);
	  driver.close();
  }
  
  
  @DataProvider
  public String[][] getData(){
	  String [][] LoginData= {{"Chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login","Admin", "admin123"}};
	  return LoginData;
  }
}
