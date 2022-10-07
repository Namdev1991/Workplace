package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) {
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));
		WebDriver cd=new ChromeDriver();
		
		cd.get("https://opensource-demo.orangehrmlive.com/");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		cd.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		cd.findElement(By.cssSelector("input#btnLogin")).click();
		
	
	}
}
