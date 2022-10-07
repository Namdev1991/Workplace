package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadCreationPage {

	WebDriver driver;
	
	public LeadCreationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#Leads_listView_basicAction_LBL_ADD_RECORD")
	private WebElement leadaddbutton;
	
	@FindBy(css="#select2-chosen-2")
	private WebElement salotation;
	
	@FindBy(css=".select2-drop>ul>li:nth-child(2)>div")
	private WebElement selectsalotation;
	
	@FindBy(css="#Leads_editView_fieldName_firstname")
	private WebElement firstname;
	
	@FindBy(css="#Leads_editView_fieldName_lastname")
	private WebElement lastname;
	
	@FindBy (css="#Leads_editView_fieldName_phone")
	private WebElement phone;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButton;
	
	
	@FindBy(xpath="//h4[contains(text(), 'Leads')]")
	private WebElement Leadsmenu;
	
	@FindBy(xpath="//a[text()='Namdev']")
	private WebElement namevalidation;
	//Elements of Lead Delete
	@FindBy(css=".listViewEntriesCheckBox")
	private WebElement checkboxofLeadCreated;
	
	@FindBy(id="Leads_listView_massAction_LBL_DELETE")
	private WebElement deleteButton;
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement yesconfirm;
	
	@FindBy(css="listview-table>tbody>tr")
	private WebElement listofleads;
	
	
	public void Leadcreation(String fName,String lName,String mobNo) throws InterruptedException {
		leadaddbutton.click();
		salotation.click();
		selectsalotation.click();
		firstname.sendKeys(fName);
		lastname.sendKeys(lName);
		phone.sendKeys(mobNo);
		saveButton.click();
		Thread.sleep(2000);
		Leadsmenu.click();
	}
	public boolean validation() {
		checkboxofLeadCreated.click();
		return checkboxofLeadCreated.isSelected();
	}
	public boolean nameValidate() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(namevalidation));
		return namevalidation.isDisplayed();
	}
	
	public void leadDelete() {
		//checkboxofLeadCreated.click();
		deleteButton.click();
		yesconfirm.click();
	}
	public String deletevalidation() {
		String listname=listofleads.getCssValue("class");
		return listname;
	}
}
