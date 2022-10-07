package basicselenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativepathFire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");//Get current Directory
		String str1="\\Executables\\geckodriver.exe"; //Remaining path
		System.setProperty("webdriver.gecko.driver", str+str1);
		FirefoxDriver cd=new FirefoxDriver();
		
		cd.get("https://www.google.com/");
	}

}
