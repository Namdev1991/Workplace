package switchstatement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.SeleniumUtility;

public class SwitchtoWindowIRCTCCatering {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome", "https://erail.in/");
		String currentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='eCatering']")).click();
		Set<String> allWindow=driver.getWindowHandles();
		allWindow.remove(currentWindow);
		Iterator itr=allWindow.iterator();
		String childWindow=(String) itr.next();
		driver.switchTo().window(childWindow);
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.findElement(By.xpath("//input[@placeholder=\"Search Train or Station to explore\"]")).click();
		WebElement active=driver.switchTo().activeElement();
		active.sendKeys("12627");
		driver.findElement(By.xpath("//button[@class=\"body-3 text-gray-60 h-10 px-4 w-full text-left leading-relaxed \"]")).click();
		driver.findElement(By.xpath("//input[@name=\"date\"]")).click();
		for(int i=0;i<5;i++) {
			driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		WebElement boardingStation=driver.findElement(By.xpath("//select[@placeholder=\"Boarding Station\"]"));
		Select s2=new Select(boardingStation);
		s2.selectByVisibleText("Daund Jn - DD");
		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
		List<WebElement> ListofStation=driver.findElements(By.xpath("//div[@class=\"flex flex-col\"]/div/div"));
		System.out.println("Size of Stations ="+ListofStation.size());
		Actions act=new Actions(driver);
		for(int i=0;i<ListofStation.size();i++) {
			System.out.println(ListofStation.get(i).getText());
			act.moveToElement(ListofStation.get(i)).click().build().perform();
			Thread.sleep(2000);
			List<WebElement> Listofrestaurants=driver.findElements(By.xpath("//div[@class=\"w-2/3 pl-6 flex flex-col gap-4 pt-10 pb-24\"]/div/div[2]"));
			for(int j=0;j<Listofrestaurants.size();j++) {
				System.out.println(Listofrestaurants.get(j).getText());
			}

		}

}

}
