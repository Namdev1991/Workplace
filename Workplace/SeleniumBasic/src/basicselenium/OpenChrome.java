package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UtilityMethods s1=new UtilityMethods();
		s1.setUp("chrome", "https://www.flipkart.com/");
		s1.takeScreenshot(".\\Screenshot\\flipcart.png");
		
	}

}
