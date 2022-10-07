package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActitimeLoginPage {

	WebDriver driver;
	 public ActitimeLoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//input[@name=\"username\"]")
	 private WebElement usernamefield;
	 
	 @FindBy(xpath="//input[@name=\"pwd\"]")
	 private WebElement passwordfield;
	 
	 @FindBy(css="a[id=\"loginButton\"]")
	 private WebElement LoginButton;
	 
	 @FindBy(xpath="//span[contains(text(),'Username or Password is invalid. Please try again.')]")
	 private WebElement Errormsg;
	 
	@FindBy(xpath="//a[@class=\"content tasks\"]")
	private WebElement task;
	 
	 public void Login(String username,String password) {
		 usernamefield.click();
		 usernamefield.sendKeys(username);
		 passwordfield.click();
		 passwordfield.sendKeys(password);
		 LoginButton.click();
		
	 }
//	 public boolean Validation () {
	// WebDriverWait wait =new WebDriverWait(driver,20); 
	 //wait.until(ExpectedConditions.visibilityOf(task));
//		 System.out.println(driver.getTitle());
//		 Thread
//		 return driver.getTitle().contains("actiTIME -  Enter Time-Track");
//	 }
	 
	 public boolean ErrorValidation() {
		 boolean result=Errormsg.isDisplayed();
		 //Assert.assertFalse(driver.getTitle().contains("actiTIME - Enter Time-Track"));
		return result;
	 }
	 
	 
}
