package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));
		WebDriver cd=new ChromeDriver();
		cd.get("https://opensource-demo.orangehrmlive.com/");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Maximize the Window
		cd.manage().window().maximize();
		Thread.sleep(10000);
		
		// To refresh our Page 
		cd.navigate().refresh();
		
		//find out any Element and click on it
		 cd.findElement(By.linkText("Forgot your password?")).click();
		 
		 // To Going Backword in window use Below Syntax
		 cd.navigate().back();
		 Thread.sleep(5000);
		 
		 //Again Going Forward
		 cd.navigate().forward();
		 Thread.sleep(5000);
		 
		 //Navigate to another URL
		 cd.navigate().to("https://www.facebook.com/");
		 Thread.sleep(3000);
		
		//Minimize to any size
		cd.manage().window().setSize(new Dimension(500,600));
		
		cd.close();
		

	}

}
