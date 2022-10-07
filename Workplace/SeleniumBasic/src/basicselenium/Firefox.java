package basicselenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "M:\\Workplace\\SeleniumBasic\\Executables\\geckodriver.exe");
		FirefoxDriver cd=new FirefoxDriver(); 
		cd.get("https://www.youtube.com/");
	}

}
