package pageObjectModel;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.SeleniumUtility;
import webPages.ContactCreateandDeletepage;
import webPages.HomePageVtiger;
import webPages.LoginPageofVtiger;

public class ContactCreationandDelete extends SeleniumUtility {

	WebDriver driver;
	@BeforeTest
	public void Prerequisite() throws IOException {
		ContactCreateandDeletepage ccpage=new ContactCreateandDeletepage(driver);
		String appurl=ccpage.geturl();
		driver=setUp("chrome",appurl);
		LoginPageofVtiger lpage=new LoginPageofVtiger(driver);
		HomePageVtiger hpage = new HomePageVtiger(driver);
		lpage.Login("admin", "Test@123");
		lpage.waitfor(5);
		hpage.navigatetocontactpage();	
	}

	@Test
	public void contactcreate() throws IOException{
		ContactCreateandDeletepage ccpage=new ContactCreateandDeletepage(driver);
		ccpage.createcontact();
		Assert.assertEquals(driver.getTitle(), "Contacts - Namdev Tarange");
	}
	@Test
	public void contactdelete() {
		ContactCreateandDeletepage ccpage=new ContactCreateandDeletepage(driver);
		ccpage.deleteContact();
	}
}
