package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class Jspractice extends SeleniumUtility{
	WebDriver driver;
	
  @Test
  public void Login() throws InterruptedException {
  driver= setUp("Chrome","https://opensource-demo.orangehrmlive.com/");
  	JavascriptExecutor js=(JavascriptExecutor)driver;
  WebElement username=driver.findElement(By.name("username"));

  	js.executeScript("arguments[0].value='Admin';",username);
  	WebElement password=driver.findElement(By.name("password"));
  	js.executeScript("arguments[0].value='admin123';",password);
 
  	js.executeScript("documents.getElementsByClassName('oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')[0].click();");
  	
  	Thread.sleep(5000);
  
 
  }
}
