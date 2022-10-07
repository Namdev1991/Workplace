package webPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageofVtiger {

	WebDriver driver;
	public LoginPageofVtiger(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(id="username")
//	private WebElement username;
//	
//	@FindBy(css="#password")
//	private WebElement pwd;
//	
//	@FindBy(xpath="//button[text()='Sign in']")
//	private WebElement loginButton;
//	
//	public void Logintopage(String user,String pass) {
//		username.click();
//		username.clear();
//		username.sendKeys(user);
//		pwd.click();
//		pwd.clear();
//		pwd.sendKeys(pass);
//		loginButton.click();
//	}
	@FindBy(xpath="//strong[text()='My Dashboard']")
	private WebElement dashboard;
	
	
	public void Login(String user,String pass) {
		WebElement uN=driver.switchTo().activeElement();
		uN.clear();
		uN.sendKeys(user,Keys.TAB);
		WebElement pw=driver.switchTo().activeElement();
		pw.clear();
		pw.sendKeys(pass,Keys.ENTER);
	}
	public void waitfor(int Time) {
		WebDriverWait wait=new WebDriverWait(driver,Time);
		wait.until(ExpectedConditions.visibilityOf(dashboard));
	}
}
