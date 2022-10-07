import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crickinfo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.espncricinfo.com/");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(cd,20);
		List<WebElement> menus=cd.findElements(By.xpath("//div[@class=\"ds-flex ds-items-center ds-justify-between ds-flex-1\"]/div/div/a"));	

		Actions act=new Actions(cd);
		for(int i=0;i<menus.size();i++) {
			System.out.println(i+" "+menus.get(i).getText());
			act.moveToElement(menus.get(i)).build().perform();
			Thread.sleep(5000);
			List<WebElement> submenu=cd.findElements(By.xpath("//div[@class=\"ds-px-2 ds-py-2\"]/ul/li/a/span"));
			for(int j=0;j<submenu.size();j++) {
				System.out.print((j+1)+" "+submenu.get(j).getText()+" ");
			}System.out.println();
			try {
				cd.findElement(By.id("wzrk-cancel")).click();		
			}
			catch(RuntimeException e) {
				System.out.println("Popup found and Handled");
			}

		}
	}
}
