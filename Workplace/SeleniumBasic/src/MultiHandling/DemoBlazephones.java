package MultiHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazephones {

	public static void main(String[] args) {
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));
	
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.demoblaze.com/");// Entering Url
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> DiviceName=cd.findElements(By.cssSelector(".row>div>div>div>div>div>h4>a"));
		List<WebElement> Price=cd.findElements(By.cssSelector(".row>div>div>div>div>div>h5"));
		
		System.out.println(DiviceName.size());
		for(int i=0;i<DiviceName.size();i++) {
			System.out.println(DiviceName.get(i).getText()+ "   "+Price.get(i).getText());
		}
	}
}
