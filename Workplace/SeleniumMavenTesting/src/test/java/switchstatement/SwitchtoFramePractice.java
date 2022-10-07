package switchstatement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.SeleniumUtility;

public class SwitchtoFramePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		List<WebElement> frames=driver.findElements(By.cssSelector("body>ul>li>span"));
		WebElement trg=driver.findElement(By.cssSelector("body>ul>li:nth-of-type(2)"));
		for(int i=frames.size()-1;i>1;i--) {
			s1.performDranAndDrop(frames.get(i), trg);
		}
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Demos']")).click();
		
	}

}
