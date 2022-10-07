import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyBoard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		cd.get("https://demo.automationtesting.in/Register.html");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(cd,20);
		Actions act=new Actions(cd);
		cd.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		WebElement firstname=cd.findElement(By.xpath("//input[@type=\"text\"and @placeholder=\"First Name\"]"));
		firstname.sendKeys("Namdev");
		Thread.sleep(2000);
		act.moveToElement(firstname).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		WebElement lastname=cd.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		act.moveToElement(lastname).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
	}

}
