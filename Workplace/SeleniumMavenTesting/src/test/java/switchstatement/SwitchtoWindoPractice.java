package switchstatement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.SeleniumUtility;

public class SwitchtoWindoPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver= s1.setUp("Chrome", "https://demo.automationtesting.in/Windows.html");
		String currentwindow=driver.getWindowHandle();
		driver.findElement(By.cssSelector(".btn.btn-info:nth-child(1)")).click();
		Set<String> allWindows=driver.getWindowHandles();
		allWindows.remove(currentwindow);
		Iterator itr=allWindows.iterator();
		String childwindow=(String) itr.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		driver.switchTo().window(currentwindow);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	}

}
