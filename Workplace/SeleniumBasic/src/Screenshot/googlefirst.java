package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlefirst {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",str.concat("\\Executables\\chromedriver.exe"));
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File(".\\Screenshot\\google.png"));
		
		
		
	
}
}