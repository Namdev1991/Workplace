package switchstatement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.SeleniumUtility;

public class SwitchFramejquery {

	public static void main(String[] args) {
	SeleniumUtility s1=new SeleniumUtility();
	WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/");
	driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));//Finding Frame
	driver.switchTo().frame(frame);//Switching to Frame
	List<WebElement> frames=driver.findElements(By.cssSelector("body>ul>li"));//Find source Options
	//List<WebElement> trg=driver.findElements(By.cssSelector("body>ul>li"));
	WebElement trg=driver.findElement(By.cssSelector("body>ul>li:nth-of-type(1)"));//Finding Target Element
	for(int i=frames.size()-1;i>=0;i--) {
	s1.performDranAndDrop(frames.get(i), trg);//Performing Drag and Drop
	}
	driver.switchTo().defaultContent();
	s1.takeScreenshot(".\\Screenshots\\aftersorting.png");
	driver.close();
}
}
