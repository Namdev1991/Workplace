package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageVtiger {
	WebDriver driver;
	
	public HomePageVtiger(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//or
		
//		HomePageVtiger ref=new HomePageVtiger(driver);
//		PageFactory.initElements(driver, ref);
//		
//		//or
//		HomePageVtiger ref1=PageFactory.initElements(driver, HomePageVtiger.class);
	}
	
	@FindBy(css="#appnavigator")
	private WebElement flownavigator;
	
	@FindBy(xpath="//span[text()=' MARKETING']")
	private WebElement selectmarketing;
	
	@FindBy(xpath="//span[text()=' Leads']")
	private WebElement selectleads;
	
	@FindBy(xpath="//span[text()=' Contacts']")
	private WebElement selectContact;
	
	public void navigatetoleadpage() {//----------->  For Navigation to LeadPage
		flownavigator.click();
		selectmarketing.click();
		selectleads.click();
	}
	
	public void navigatetocontactpage() {
		flownavigator.click();
		selectmarketing.click();
		selectContact.click();
	}
	
}
