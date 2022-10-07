package calendarHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\AppData\\RedBus.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String key=prop.getProperty("key");
		String path=prop.getProperty("path");
		System.setProperty(key, path);
		String url=prop.getProperty("url");
		WebDriver cd=new ChromeDriver();
		cd.get(url);
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement from=cd.findElement(By.cssSelector("#src"));
		from.click();
		from.sendKeys("Pune");
		cd.findElement(By.cssSelector("li[data-id=\"67159\"]")).click();
		WebElement to=cd.findElement(By.cssSelector("#dest"));
		to.click();
		to.sendKeys("goa");
		cd.findElement(By.cssSelector("li[data-id=\"73799\"]")).click();
		Thread.sleep(2000);
		WebElement date=cd.findElement(By.cssSelector("#onward_cal"));
		date.click();
		cd.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>tr:nth-child(1)>td:nth-child(3)")).click();//To Move Next month
		cd.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>tr:nth-child(4)>td:nth-child(4)")).click();//To Select date
		cd.findElement(By.cssSelector("#search_btn")).click();//To select Button
		Thread.sleep(2000);
		cd.findElement(By.cssSelector(".w-25.fr>span")).click();//To ok popup
		cd.findElement(By.cssSelector(".dept-time.dt-time-filter>li:nth-child(4)")).click();
		Thread.sleep(2000);
		cd.findElement(By.cssSelector(".list-chkbox>li:nth-of-type(3)>label:nth-of-type(1)")).click();
		Thread.sleep(10000);
		List<WebElement> buses=cd.findElements(By.cssSelector(".bus-items:nth-of-type(1) .column-two.p-right-10.w-30.fl>div"));
		List<WebElement> price=cd.findElements(By.cssSelector(".bus-items:nth-of-type(1) .fare.d-block>span"));
		for(int i=0;i<price.size();i++) {
			System.out.println("Bus"+buses.get(i).getText()+" price ="+price.get(i).getText());
		}
		 
	}

}
