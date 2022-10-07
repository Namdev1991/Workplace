package MultiHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartValidation {

	public static void main(String[] args) throws InterruptedException {
			String str=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));
			WebDriver cd = new ChromeDriver();
			cd.get("https://www.flipkart.com/");
			cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			List<WebElement> menu=cd.findElements(By.cssSelector(".eFQ30H>a>div:nth-child(2)"));
			System.out.println("Main menu Option count= "+menu.size());
			
//			Iterator itr=menu.iterator();
//			while(itr.hasNext()){
//			System.out.println(itr.next());		
//			}
			cd.findElement(By.cssSelector("button[class=\"_2KpZ6l _2doB4z\"]")).click();
			Thread.sleep(2000);
			for(int i=0;i<menu.size();i++) {
				System.out.println(menu.get(i).getText());
			}
}
}
