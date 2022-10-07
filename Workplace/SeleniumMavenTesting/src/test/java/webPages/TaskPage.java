package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskPage {
	WebDriver driver;
	
	public TaskPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".addNewButton>div:nth-child(3)")
	private WebElement addButton;
	
	@FindBy(css=".item.createNewTasks")
	private WebElement newtask;
	
	@FindBy(css=".customerSelector> div>div>div:nth-child(3)")
	private WebElement dropdown;
	
	@FindBy(css=".customerSelector .searchItemList>div:nth-child(8)")
	private WebElement selectcustomer;
	
	@FindBy(css=".selectProjectRow .comboboxButton>div:nth-child(3)")
	private WebElement projectdropdown;
	
	@FindBy(css=".projectSelector .searchItemList>div:nth-child(3)")
	private WebElement selectproject;
	
	@FindBy(css="#createTasksPopup_content tbody>tr:nth-of-type(1)>.nameCell.first>input[placeholder=\\\"Enter task name\\\"]")
	private WebElement taskname;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createtaskbutton;
	
	@FindBy(css=".tasksTable .selection>div")
	private WebElement checkbox;
	
	@FindBy(css=".delete.button")
	private WebElement delete;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement submitdelete;
	
		WebDriverWait wait;
	
	public String Title() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(addButton));
		Thread.sleep(3000);
		String title=driver.getTitle();
		return title;
	}
	public void taskCreate(String nameoftask ) {
		addButton.click();
		newtask.click();
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		dropdown.click();
		selectcustomer.click();
		projectdropdown.click();
		selectproject.click();
		taskname.sendKeys(nameoftask);
		createtaskbutton.click();
	}
	public boolean Validationofcreatedtask() {
		checkbox.click();
		return checkbox.isSelected();
	
	}
	
	public void taskdelete() {
		checkbox.click();
		wait.until(ExpectedConditions.visibilityOf(delete));
		delete.click();
		submitdelete.click();
	}
	public boolean deleteValidation() {
		checkbox.click();
		return checkbox.isSelected();
	
	}
}
