package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorandSynchronisation {

	public static void main(String[] args) throws InterruptedException {
		String str=System.getProperty("user.dir");
		String path=str.concat("\\Executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver cd=new ChromeDriver();
		cd.get("https://demo.actitime.com/login.do");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// ----> Implicit Synchronization
		cd.findElement(By.name("username")).sendKeys("admin");
		cd.findElement(By.name("pwd")).sendKeys("manager");
		cd.findElement(By.id("loginButton")).click();
		
		Thread.sleep(10000);  //----> Explicit synchronization  Static Type
		String title=cd.getTitle();
		System.out.println(title);
		String expectedtitle="actiTIME -  Enter Time-Track";
		System.out.println(title.equals(expectedtitle));
		//cd.close();
		

	}

}
