import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.UtilityMethods;

public class DragandDropPractice extends UtilityMethods {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=setUp("chrome","https://www.globalsqa.com/demo-site/draganddrop/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"))));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]")));
		List<WebElement> sources=driver.findElements(By.xpath("//ul[@id=\"gallery\"]/li"));
		WebElement target=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(sources.get(0), target).build().perform();
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File storage=new File(".\\Screenshot\\globalDragDrop.png");
		FileUtils.copyFile(source, storage);
	}

}
