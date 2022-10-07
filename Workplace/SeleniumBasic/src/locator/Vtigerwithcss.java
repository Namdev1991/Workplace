package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigerwithcss {

	public static void main(String[] args)throws Exception {
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", str.concat("\\Executables\\chromedriver.exe"));
		
		WebDriver cd=new ChromeDriver();
		cd.get("https://demo.vtiger.com/vtigercrm/index.php");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		String currenturl=cd.getCurrentUrl();
		String expectedurl="https://demo.vtiger.com/vtigercrm/index.php";
		System.out.println("Validate login page = "+currenturl.equals(expectedurl));
		
		//Enter Url
		WebElement username=cd.findElement(By.cssSelector("#username"));
		username.clear();
		username.sendKeys("admin");
		
		//Enter Password
		//Click on signin button
		cd.findElement(By.cssSelector(".button.buttonBlue")).click();
		Thread.sleep(5000);
		String expectedtitle="Dashboard";
		System.out.println("Validation home Page = "+cd.getTitle().equals(expectedtitle));
		
		//Find Element for Add Widget
		WebElement widget=cd.findElement(By.cssSelector(".addButton.dropdown-toggle"));
		widget.click();
		cd.findElement(By.cssSelector("a[data-name=\"TotalRevenuePerSalesPerson\"]")).click();
		widget.click();
		cd.findElement(By.cssSelector("a[data-linkid=\"67\"]")).click();
		widget.click();
		cd.findElement(By.cssSelector("a[data-linkid=\"57\"]")).click();
		
		Thread.sleep(5000);
		//Click on Profile
		cd.findElement(By.cssSelector("a.userName.dropdown-toggle.pull-right")).click();
		cd.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT"));
		Thread.sleep(5000);
		cd.close();
	}

}
