package mavenfirst;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utility.SeleniumUtility;

public class TakingScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		s1.setUp("chrome", "https://www.espncricinfo.com/");
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".\\Screenshots\\amazonhomepage.png");
//		FileUtils.copyFile(src, trg);
		s1.takeScreenshot(".\\Screenshots\\crickinfo.png");
		
		
	}

}
