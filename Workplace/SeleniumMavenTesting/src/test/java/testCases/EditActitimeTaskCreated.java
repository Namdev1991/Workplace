package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class EditActitimeTaskCreated {
  @Test
  public void TaskEdit() {
	  SeleniumUtility s1=new SeleniumUtility();
	  WebDriver driver=s1.setUp("Chrome", "https://demo.actitime.com/login.do");
	  driver.switchTo().activeElement().sendKeys("admin",Keys.TAB);
	  driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	  driver.findElement(By.cssSelector("#container_tasks")).click();
	  driver.findElement(By.xpath("//div[@class=\"plusIcon\"]")).click();
	  driver.findElement(By.xpath("//div[@class=\"item createNewTasks\"]")).click();
	  driver.findElement(By.xpath("//div[@class=\"customerSelector customerOrProjectSelector selectorWithPlaceholderContainer\"]")).click();
	  Actions act=new Actions(driver);
	  WebElement company=driver.findElement(By.xpath("//div[@class=\"itemRow cpItemRow \"][9]"));
	  act.moveToElement(company).click().build().perform();
	  driver.findElement(By.xpath("//div[@class=\"emptySelection\"]")).click();
	  act.moveToElement(driver.findElement(By.cssSelector(".projectSelector .searchItemList>.itemRow:nth-child(5)"))).click().build().perform();
	  WebElement task= driver.findElement(By.xpath("//input[@class=\"inputFieldWithPlaceholder\"and @placeholder=\"Enter task name\"][1]"));
	  task.click();
	  task.sendKeys("Task for Edit");
	  driver.findElement(By.xpath("//div[@class=\"components_button withPlusIcon\"]")).click();
	  driver.findElement(By.xpath("//div[@class=\"checkbox inactive\"and @style=\"display: flex;\"]")).click();
	  driver.findElement(By.cssSelector(".changeStatus.button")).click();
	  driver.findElement(By.cssSelector(".taskStatusButton.editable.pressed>div>div:nth-of-type(3)")).click();
	  driver.findElement(By.xpath("/html/body/div[26]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[3]/div/div[3]")).click();

  }
}
