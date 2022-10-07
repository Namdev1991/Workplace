package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1108ActiTime {

	public static void main(String[] args) throws InterruptedException {
		String str=System.getProperty("user.dir");
		String path=str.concat("\\Executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username=driver.findElement(By.name("username"));
		System.out.println("UN disp = "+username.isDisplayed());
		System.out.println("UN ena = "+username.isEnabled());
		System.out.println("UN sel = "+username.isSelected());
		System.out.println("Atribute"+username.getAttribute("placeholder"));
		
		WebElement password=driver.findElement(By.name("pwd"));
		System.out.println("pw disp = "+password.isDisplayed());
		System.out.println("pw ena = "+password.isEnabled());
		System.out.println("pw sel = ="+password.isSelected());
		System.out.println(password.getAttribute("type"));
		
		//driver.findElement(By.id("loginButton")).click();
		WebElement keep=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println("K sel = "+keep.isSelected());
		System.out.println("K disp = "+keep.isDisplayed());
		System.out.println("K ena = "+keep.isEnabled());
		String keeplogin=keep.getText();
		System.out.println(keeplogin);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		String Title=driver.getTitle();
		String expectedtitle="actiTIME - Enter Time-Track";
		System.out.println("Title = "+Title.equals(expectedtitle));
		
		//WebElement TT=driver.findElement(By.className("content selected tt"));
		//System.out.println(TT.isDisplayed());
		driver.findElement(By.id("logoutLink")).click();
		
		driver.close();
	}
}
