package MultiHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaPhone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));
		
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.gsmarena.com/search.php3?");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> li=cd.findElements(By.cssSelector(".brandmenu-v2>ul>li"));
		System.out.println("Count of Phones = "+li.size());
		
		for(int i=0;i<li.size();i++) {
			System.out.println(i+" = "+li.get(i).getText());
		}
		Thread.sleep(5000);
		WebElement samsung=cd.findElement(By.cssSelector("a[href=\"samsung-phones-9.php\"]"));
		samsung.click();
		
		List<WebElement> Pagination=cd.findElements(By.cssSelector(".nav-pages>a"));
		if(Pagination.size()>0) {
			System.out.println("Pagination Exist");
		}else {
			System.out.println("No Pagination");
		}
		for(WebElement a: Pagination) {
			System.out.println(a.getText());
		}
		for(int i=0;i<Pagination.size();i++) {
			System.out.println(cd.getCurrentUrl());
			Pagination.get(i).click();
			Thread.sleep(2000);
			//To avoid Stale Element exception find element of pagination again
			Pagination=cd.findElements(By.cssSelector(".nav-pages>a"));
			if(i==Pagination.size()-1) {
				System.out.println(cd.getCurrentUrl());
			}
		}
		
		
	}

}
