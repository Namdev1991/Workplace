package MultiHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));
		WebDriver cd=new ChromeDriver();
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.get("https://www.espncricinfo.com/");
		cd.manage().window().maximize();
		String expectedtitle="Live cricket scores, match schedules, latest cricket news, cricket videos";
		String currenttitle=cd.getTitle();
		System.out.println("Validation of Title = "+expectedtitle.equals(currenttitle));
		Thread.sleep(5000);
		List<WebElement> li=cd.findElements(By.cssSelector(".ds-popper-wrapper>a"));
		System.out.println("count of main menu+"+li.size());
		for(int i=0;i<li.size();i++) {
			System.out.println(i+" = "+li.get(i).getText());
		}
		cd.close();
		
	}

}
