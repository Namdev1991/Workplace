package MultiHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));

		WebDriver cd=new ChromeDriver();
		cd.get("https://www.google.com/");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement searchbox=cd.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("http://www.google.com/");

		List<WebElement>list=cd.findElements(By.cssSelector(".wM6W7d>span>b:nth-of-type(4)"));
		Thread.sleep(5000);
		System.out.println("Count of Suggestions = "+list.size());

		for(int i=0;i<list.size();i++) {
			System.out.println("Suggestion "+i+" "+list.get(i).getText());
		}


	}

}
