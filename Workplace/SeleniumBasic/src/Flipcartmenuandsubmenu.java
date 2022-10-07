import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipcartmenuandsubmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.flipkart.com/");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		List<WebElement> menu=cd.findElements(By.xpath("//div[@class=\"InyRMC _3Il5oO\"]/div/div/a/div[2]"));
		Actions act=new Actions(cd);
		//List<WebElement> submenu=cd.findElements(By.xpath("//div[@class=\"_3XS_gI _7qr1OC\"]/a"));
		//act.moveToElement(menu.get(3)).build().perform();,
		WebDriverWait wait=new WebDriverWait(cd,20);
	
	for(int i=0;i<menu.size();i++) {
		System.out.println(i+" "+menu.get(i).getText());
		act.moveToElement(menu.get(i)).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"InyRMC _3Il5oO\"]/div/div/a/div[2]")));
		List<WebElement> submenu=cd.findElements(By.xpath("//div[@class=\"_3XS_gI _7qr1OC\"]/a"));
		for(int j=0;j<submenu.size();j++) {
			System.out.print(j+submenu.get(j).getText()+" ");
		}System.out.println();
		}
	}

}
