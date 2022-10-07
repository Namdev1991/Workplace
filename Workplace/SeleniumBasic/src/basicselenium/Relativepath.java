package basicselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Relativepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(System.getProperty("user.dir"));
	//	String str=System.getProperty("M:\\Workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		
		cd.get("https://www.google.com/");

	}

}
