package Byusexpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonmobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.amazon.in/b?node=1805560031");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.findElement(By.xpath("//div[@id=\"nav-xshop\"]/a[2]")).click();
		cd.findElement(By.xpath("//div[@class=\"sl-sobe-carousel-sub-card-image\"][1]/img[1]")).click();
		WebElement price=cd.findElement(By.xpath("//div[div[h2[a[span[text()='realme narzo 50i (Mint Green, 4GB RAM+64GB Storage) - 6.5\" inch Large Display | 5000mAh Battery']]]]]/div[3]/div/a/span/span/span[2]"));
		System.out.println("Price of Mobile = "+price.getText());
	
	
	}

}
