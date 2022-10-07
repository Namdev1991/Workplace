package basicselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssDemoacti {

	public static void main(String[] args) {
		String str=System.getProperty("user.dir");
		String str1="\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", str+str1);
		
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://demo.actitime.com/");
		//1)Title Name and Length
		String title=cd.getTitle();
		System.out.println("Page Title = "+title);
		System.out.println("Page Title Length = "+title.length());
		//2)UrL and its Validation
		String currenturl=cd.getCurrentUrl();
		String Expectedurl="https://demo.actitime.com/";
		System.out.println("Url Result = "+currenturl.equals(Expectedurl));
		//3)Page source and page source length
		String source=cd.getPageSource();
		System.out.println("Page source length = "+source.length());
		//4) Page Length
		cd.close();
	}

}
