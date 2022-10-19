package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OrangeHRMLoginpage {
WebDriver driver;
	public OrangeHRMLoginpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name=\"username\" and @placeholder=\"Username\"]")
	private WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\" and @placeholder=\"Password\"]")
	private WebElement password;
	
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement Emplist;
	
	public void Login(String Username,String Password) {
		username.click();
		username.sendKeys(Username);
		password.click();
		password.sendKeys(Password);
	}
	public void clickonbutton() {
		loginbutton.click();
	}
	public boolean validation() {
		return Emplist.isDisplayed();
	}
	

}
