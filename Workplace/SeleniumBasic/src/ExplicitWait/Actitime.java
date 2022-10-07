package ExplicitWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));
		WebDriver cd=new ChromeDriver();
		cd.get("https://demo.actitime.com/login.do");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(cd,20);
		Wait waitt=new FluentWait(cd).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
		WebElement username=cd.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password=cd.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("manager");
		cd.findElement(By.id("loginButton")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		System.out.println("Page Title = "+cd.getTitle());
		cd.findElement(By.id("logoutLink")).click();
		
		
	}

}
