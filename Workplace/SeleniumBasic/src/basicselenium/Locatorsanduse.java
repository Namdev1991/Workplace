package basicselenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsanduse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");
		String Path=str.concat("\\Executables\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", Path);

		WebDriver cd=new ChromeDriver();

		cd.get("https://www.google.com/");//  1)Open page
		WebElement search=cd.findElement(By.name("q"));
		//		cd.findElement(By.)
		search.clear();
		search.sendKeys("crick.buzz");
		search.click();
		List<WebElement> li=cd.findElements(By.cssSelector(".G43f7e>li>div>div>div>span>b"));

		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i).getText());
		}


	}

}
