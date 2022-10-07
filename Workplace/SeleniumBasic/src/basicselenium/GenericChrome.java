package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericChrome {

	public static void main(String[] args) {
		String currentdirectory=System.getProperty("user.dir");
		String path="\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", currentdirectory+path);
		
		WebDriver cd=new ChromeDriver();	//Generic Object and this is Real time Polymorphism Example
		
		cd.get("https://www.google.com/");
		String title=cd.getTitle();
		String expected="Google";
		System.out.println(title.equals(expected));
		String source=cd.getPageSource();
		System.out.println(source.length());
		cd.close();
		
	}
}
