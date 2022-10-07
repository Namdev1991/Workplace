package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssOrangeHrm {

	public static void main(String[] args) {
		String str=System.getProperty("user.dir");
		String Path=str.concat("\\Executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", Path);
		
		WebDriver cd=new ChromeDriver();
		cd.get("https://opensource-demo.orangehrmlive.com/");
		
		//1) Validate Login Page
		String currenturl=cd.getCurrentUrl();
		String expectedurl="https://opensource-demo.orangehrmlive.com/";
		System.out.println(currenturl.equals(expectedurl));
		
		//2)Username As Admin
		WebElement username=cd.findElement(By.name("txtUsername"));
		username.clear();
		username.sendKeys("Admin");
		//3) Password As admin123
		WebElement pw=cd.findElement(By.id("txtPassword"));
		pw.clear();
		pw.sendKeys("admin123");
		//4)Click on Login Button
		WebElement submit=cd.findElement(By.id("btnLogin"));
		submit.click();
		
		//5) Validate Home Page
		String homeurl=cd.getCurrentUrl();
		String expectedhome="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		System.out.println(homeurl.equals(expectedhome));
	
		cd.close();
		
	}
}
