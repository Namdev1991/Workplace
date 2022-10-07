package webPages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactCreateandDeletepage {

	WebDriver driver;
	
	public ContactCreateandDeletepage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id=\"Contacts_listView_basicAction_LBL_ADD_RECORD\"]")
	private WebElement addcontact;
	
	@FindBy(id="s2id_autogen1")
	private WebElement salotation;
	
	@FindBy(css=".select2-results>li:nth-child(2)>div")
	private WebElement selectsalotation;
	
	@FindBy(id="Contacts_editView_fieldName_firstname")
	private WebElement Fname;
	
	@FindBy(id="Contacts_editView_fieldName_lastname")
	private WebElement Lname;
	
	@FindBy (id="Contacts_editView_fieldName_phone")
	private WebElement phone;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement savebutton;
	
	@FindBy(xpath="//h4[contains(text(),'Contacts')]")
	private WebElement contactslink;
	
	@FindBy(xpath="//input[@class=\"listViewEntriesCheckBox\"]")
	private WebElement checkbox;
	
	@FindBy(id="Contacts_listView_massAction_LBL_DELETE")
	private WebElement delete;
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement confirmyes;
	
	public String geturl() throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\main\\java\\Contact.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String appurl=prop.getProperty("url");
		return appurl;
	}
	public void createcontact() throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\main\\java\\Contact.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String name=prop.getProperty("fname");
		String lastname=prop.getProperty("lname");
		String phonenumber=prop.getProperty("phoneno");
		addcontact.click();
		salotation.click();
		selectsalotation.click();
		Fname.sendKeys(name);
		Lname.sendKeys(lastname);
		phone.sendKeys(phonenumber);
		savebutton.click();
	}
	public void createcontact(String name,String lastname,String phonenumber) {
		addcontact.click();
		salotation.click();
		selectsalotation.click();
		Fname.sendKeys(name);
		Lname.sendKeys(lastname);
		phone.sendKeys(phonenumber);
		savebutton.click();
	}
	public void deleteContact() {
		contactslink.click();
		checkbox.click();
		delete.click();
		confirmyes.click();
	}
}
