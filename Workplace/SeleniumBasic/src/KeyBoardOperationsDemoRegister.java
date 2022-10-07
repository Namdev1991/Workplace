import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyBoardOperationsDemoRegister {

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
		firstname.sendKeys("Namdev",Keys.TAB); 
		cd.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Tarange",Keys.TAB);
		cd.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Pune 413114",Keys.TAB);
		cd.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("namdevtarange2020@gnail.com",Keys.TAB);
		cd.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9970342871",Keys.TAB);
		cd.findElement(By.xpath("//input[@type=\"radio\"][1]")).click();
		cd.findElement(By.cssSelector("#checkbox1")).click();
		cd.findElement(By.cssSelector("#checkbox2")).click();
		//cd.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		cd.findElement(By.cssSelector("body")).sendKeys(Keys.END);
		Thread.sleep(2000);
		cd.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//a[text()='English']")).click();
		cd.findElement(By.cssSelector("body")).click();
		WebElement list=cd.findElement(By.cssSelector("#Skills"));
		Select listref=new Select(list);
		listref.selectByVisibleText("Java");
		cd.findElement(By.xpath("//span[@class=\"select2-selection__arrow\"]")).click();
		cd.findElement(By.xpath("//ul[@id=\"select2-country-results\"]/li[6]")).click();
		WebElement years=cd.findElement(By.cssSelector("#yearbox"));
		Select yearref=new Select(years);
		yearref.selectByVisibleText("1996");
		WebElement months=cd.findElement(By.xpath("//select[@type=\"text\" and @placeholder=\"Month\"]"));
		Select monthlist=new Select(months);
		monthlist.selectByVisibleText("September");
		WebElement day=cd.findElement(By.cssSelector("#daybox"));
		Select days=new Select(day);
		days.selectByVisibleText("16");
		cd.findElement(By.cssSelector("#firstpassword")).sendKeys("Dev@1991",Keys.TAB);
		cd.findElement(By.cssSelector("#secondpassword")).sendKeys("Dev@1991",Keys.ENTER);
		cd.close();
	
	}

}
