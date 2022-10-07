package switchstatement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.SeleniumUtility;

public class ActiveElementorangehrm {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		//Getting Admin and Password From The Application
		String userID=driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p\"][1]")).getText().substring(11);
		String password=driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p\"][2]")).getText().substring(11);
		//Move to Active Element
		WebElement username=driver.switchTo().activeElement();
		//Enter Username & Password By using Keys 
		username.sendKeys(userID,Keys.TAB);
		driver.switchTo().activeElement().sendKeys(password,Keys.ENTER);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")));
		//Logout
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.close();

	}

}
