package switchstatement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.SeleniumUtility;

public class SwitchtoactiveElementVTiger {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		//Thread.sleep(5000);
		WebElement username=driver.switchTo().activeElement();
		username.clear();
		username.sendKeys("admin",Keys.TAB);
		WebElement pwd=driver.switchTo().activeElement();
		pwd.clear();
		pwd.sendKeys("Test@123",Keys.ENTER);

	}
}
