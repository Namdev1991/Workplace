package switchstatement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.SeleniumUtility;

public class switchalertsdemoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome", "https://demoqa.com/alerts");
		//1)Alert Pop-up
		driver.findElement(By.cssSelector("#alertButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//2) Alert After 5 Sec
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//3) Confirmation POp up
		driver.findElement(By.id("confirmButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//4) prompt pop up
		driver.findElement(By.id("promtButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Dev");
		driver.switchTo().alert().accept();
		driver.close();

	}

}
