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

public class TrainTicketBook {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\AppData\\Train.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String key=prop.getProperty("key");
		String path=prop.getProperty("path");
		System.setProperty(key, path);
		WebDriver cd=new ChromeDriver();
		String url=prop.getProperty("url");
		cd.get(url);
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement from=cd.findElement(By.cssSelector("#tbsfi1"));
		from.click();
		String from1=prop.getProperty("from");
		from.sendKeys(from1);
		cd.findElement(By.cssSelector(".ui-menu-item")).click();
		Thread.sleep(2000);
		WebElement to=cd.findElement(By.cssSelector("#tbsfi3"));
		to.click();
		String To=prop.getProperty("To");
		to.sendKeys(To);
		cd.findElement(By.cssSelector("#et_autocomplete>div:nth-of-type(2)")).click();
		WebElement date=cd.findElement(By.cssSelector("#tbsfi4"));
		date.click();
		Thread.sleep(2000);
		cd.findElement(By.cssSelector("input[class=\"nav\"]")).click();
		cd.findElement(By.cssSelector(".dptbl.noinnerborder>tbody>tr:nth-of-type(4)>td:nth-of-type(5)>input")).click();
		cd.findElement(By.cssSelector("#tbsfi5")).click();
		cd.findElement(By.cssSelector("#tbsfi5>option:nth-child(2)")).click();
		cd.findElement(By.cssSelector("#tbssbmtbtn")).click();
		List<WebElement> trainNumber=cd.findElements(By.cssSelector(".myTable.data.nocps.nolrborder.bx1_brm>tbody>tr>td:nth-of-type(2)>a"));
		List<WebElement> trainname=cd.findElements(By.cssSelector(".myTable.data.nocps.nolrborder.bx1_brm>tbody>tr>td:nth-child(1)>a"));
		System.out.println(trainNumber.size());
		System.out.println(trainname.size());
		Thread.sleep(5000);
		for(int i=0;i<trainname.size();i++) {
			System.out.println(trainNumber.get(i).getText()+" "+trainname.get(i).getText());
		}
		
	}
	
}
