package basicselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssTricentis {

	public static void main(String[] args) {
		String currentDirectory=System.getProperty("user.dir");
		String Path=currentDirectory.concat("\\Executables\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", Path);

		ChromeDriver cd=new ChromeDriver();
		cd.get("http://sampleapp.tricentis.com/101/");

		//Validate Page Title
		String expectedtitle="Tricentis Vehicle Insurance";
		String title=cd.getTitle();
		System.out.println(expectedtitle.equals(title));
//
//		//Validate Page URL
		String url=cd.getCurrentUrl();
		String expectedurl="http://sampleapp.tricentis.com/101/";
		System.out.println(url.equals(expectedurl));
//
//		//Page Source and Page length
		String source=cd.getPageSource();
		System.out.println(cd.getPageSource().length());

		cd.close();

	}

}
