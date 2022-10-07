package MultiHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));
	
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.facebook.com/");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String pageTitle=cd.getTitle();
		String Expected="Facebook – log in or sign up";
		System.out.println("Validation of Page Title = "+pageTitle.equals(Expected));
	
		cd.findElement(By.cssSelector("a[data-testid=\"open-registration-form-button\"]")).click();
		
		WebElement date=cd.findElement(By.cssSelector("select[aria-label=\"Day\"]"));
		System.out.println(date.isEnabled());
		System.out.println(date.isDisplayed());
		date.click();
		List<WebElement> list=cd.findElements(By.cssSelector("._5k_4>span>select:nth-of-type(1)>option"));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
//		WebElement defaultvalue=cd.findElement(By.cssSelector("select[aria-label=\"Day\"]"));
//		System.out.println(defaultvalue.getText());
		
		
		
	}

}
