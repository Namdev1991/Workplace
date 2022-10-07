package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageofActitime {
	WebDriver driver;

	public HomePageofActitime(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Locatores of Webelements
	@FindBy(css="#container_tasks")
	private WebElement task;
	
	
	public void navigatetotaskcreation() {
		task.click();
	}
	
}
