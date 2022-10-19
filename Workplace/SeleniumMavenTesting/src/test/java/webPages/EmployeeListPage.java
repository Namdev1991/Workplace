package webPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utility.SeleniumUtility;

public class EmployeeListPage extends SeleniumUtility {

	WebDriver driver;
	public EmployeeListPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class=\"oxd-form-row\"]/div/div/div/div[2]/div/div/input[1]")
	private WebElement EmpName;
	
	@FindBy(xpath="//div[@class=\"oxd-grid-4 orangehrm-full-width-grid\"]/div[2]/div/div[2]/input")
	private WebElement EmpID;
	
	@FindBy(xpath="//div[@class=\"oxd-table-filter-area\"]/form//div[3]/div//div[@class=\"oxd-select-text-input\"]")
	private WebElement EmpStatus;
	
	@FindBy(xpath="//div[text()='Freelance']")
	private WebElement selectstatus;
	
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
	private WebElement searchbutton;
	
	@FindBy(xpath="//span[text()='No Records Found']")
	private WebElement record;
	
	public void search() {
		EmpName.click();
		EmpName.sendKeys("Champak",Keys.TAB);
		WebElement Empid=driver.switchTo().activeElement();
		Empid.sendKeys("15",Keys.TAB);
		WebElement dropdown=driver.switchTo().activeElement();
		dropdown.sendKeys(Keys.ARROW_DOWN,Keys.TAB);
		WebElement includedropdown=driver.switchTo().activeElement();
		includedropdown.sendKeys(Keys.ARROW_DOWN,Keys.TAB);
		WebElement SVname=driver.switchTo().activeElement();
		SVname.sendKeys("Akshay",Keys.TAB,Keys.ARROW_DOWN,Keys.TAB,Keys.ARROW_DOWN);
		searchbutton.click();
	}
	public void validation() {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(record));
		Assert.assertEquals(record.getText(), "No Records Found");
	}
	
}
