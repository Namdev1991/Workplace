package basicselenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AssAutoRegister {

	public static void main(String[] args) {
		
		String str=System.getProperty("user.dir");//Get current Directory
		String str1="\\Executables\\geckodriver.exe"; //Remaining path
		System.setProperty("webdriver.gecko.driver", str+str1);
		FirefoxDriver cd=new FirefoxDriver();
		
		cd.get("https://demo.automationtesting.in/Register.html");
		//Validate Page Title
		String title=cd.getTitle();
		String expectedtitle="Register";
		System.out.println(title.equals(expectedtitle));
		
		//Validate url
		String url=cd.getCurrentUrl();
		String expectedurl="https://demo.automationtesting.in/Register.html";
		System.out.println(url.equals(expectedurl));
		
		//Pagesource and Length
		String source=cd.getPageSource();
		System.out.println(source.length());
		
		cd.close();
	}

}
