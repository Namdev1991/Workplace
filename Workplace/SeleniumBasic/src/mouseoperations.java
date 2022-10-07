import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.globalsqa.com/");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> mainMenu=cd.findElements(By.xpath("//div[@id=\"menu\"]/ul/li/a"));
		Actions act=new Actions(cd);
		act.moveToElement(mainMenu.get(0)).perform();
		WebDriverWait wait=new WebDriverWait(cd,20);
		
		for(int i=0;i<mainMenu.size();i++) {
			WebElement option=mainMenu.get(i);
			act.moveToElement(option).perform();
			wait.until(ExpectedConditions.visibilityOfAllElements(mainMenu));
		}
		cd.close();
	}

}
