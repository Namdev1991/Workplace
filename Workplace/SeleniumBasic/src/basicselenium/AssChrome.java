package basicselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");
		String str1="\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", str+str1);
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.google.com/");
		//Validate Title Name
		String title=cd.getTitle();
		String Expected="Google";
		System.out.println(title.equals(Expected));
		
		//Validate url
		String currenturl=cd.getCurrentUrl();
		String Expectedurl="https://www.google.com/";
		System.out.println(currenturl.equals(Expectedurl));
		System.out.println(currenturl.contains(Expectedurl));
		//Source
		String source=cd.getPageSource();
		System.out.println(source.length());
		cd.close();
	}
}
