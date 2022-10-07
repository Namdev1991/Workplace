import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.globalsqa.com/demo-site/draganddrop/");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame = cd.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		cd.switchTo().frame(frame);

		List<WebElement> sources=cd.findElements(By.xpath("//ul[@id=\"gallery\"]/li"));
		WebElement target=cd.findElement(By.xpath("//div[@id=\"trash\"]"));
		Actions act=new Actions(cd);
		act.dragAndDrop(sources.get(0), target).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(sources.get(1),target).build().perform();

	}

}
