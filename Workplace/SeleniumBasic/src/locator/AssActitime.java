package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssActitime {

	public static void main(String[] args) {
		String currentdirectory=System.getProperty("user.dir");
		String path=currentdirectory.concat("\\Executables\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver cd=new ChromeDriver();
		cd.get("https://demo.actitime.com/login.do");
		//Validate the Page
		String currenturl=cd.getCurrentUrl();
		String expectedurl="https://demo.actitime.com/login.do";
		System.out.println(currenturl.equals(expectedurl));
		
		//FindElement and Sendkey-Username -admin
		WebElement use=cd.findElement(By.name("username"));
		use.clear();
		use.sendKeys("admin");
		
		//FindElement as Password - manager
		WebElement pw=cd.findElement(By.name("pwd"));
		pw.clear();
		pw.sendKeys("manager");
		
		//Click on Login
		WebElement login=cd.findElement(By.id("loginButton"));
		login.click();
		
		cd.close();
		
	}
}
