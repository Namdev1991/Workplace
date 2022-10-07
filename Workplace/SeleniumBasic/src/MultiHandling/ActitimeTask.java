package MultiHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));
		WebDriver cd=new ChromeDriver();
		cd.get("https://demo.actitime.com/login.do");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement username=cd.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password=cd.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("manager");
		cd.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		cd.findElement(By.id("container_tasks")).click();
		cd.findElement(By.cssSelector("div[class=\"plusIcon\"]")).click();
		cd.findElement(By.cssSelector("div[class=\"item createNewTasks\"]")).click();
		cd.findElement(By.cssSelector(".task_list.with-navigation.navBottomSpaceHidden.ext-chrome")).click();
		cd.findElement(By.cssSelector(".customerSelector  .searchItemList>.itemRow:nth-child(2)"));
		cd.findElement(By.cssSelector(".projectSelector  .searchItemList>.itemRow:nth-child(5)"));
		WebElement task=cd.findElement(By.cssSelector("#createTasksPopup_content tbody>tr:nth-of-type(1)>.nameCell.first>input[placeholder=\"Enter task name\"]"));
		task.click();
		task.sendKeys("Match");
		cd.findElement(By.cssSelector("div[class=\"components_button withPlusIcon\"]")).click();
		Thread.sleep(2000);
		cd.manage().window().maximize();
		WebElement checkbox=cd.findElement(By.cssSelector(".taskRowsTableContent>div>div>table>tbody>tr>td>div>div[class=\"img\"]"));
		checkbox.click();
		Thread.sleep(2000);
		cd.findElement(By.cssSelector(".animatedVisibilityContainer.tasklist_components_bulkOperationsPanelContainer  .delete.button")).click();
		cd.findElement(By.cssSelector(".dialogWithPointerWrapper.deleteDialog .buttonsContainer>div>div[class=\"buttonIcon\"]")).click();
		cd.findElement(By.id("logoutLink")).click();
	}

}
