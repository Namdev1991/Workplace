package basicselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "M:\\Workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		
		cd.get("https://www.google.com/");
		cd.close();
	}

}
