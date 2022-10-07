package basicselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssOrangehrm {

	public static void main(String[] args) {
		String currentDirectory=System.getProperty("user.dir");
		String Path=currentDirectory.concat("\\Executables\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", Path);

		ChromeDriver cd=new ChromeDriver();
		cd.get("https://opensource-demo.orangehrmlive.com/");

		//Validate Page Title
		String expectedtitle="OrangeHRM";
		String title=cd.getTitle();
		System.out.println(expectedtitle.equals(title));

		//Validate Page URL
		String url=cd.getCurrentUrl();
		String expectedurl="https://opensource-demo.orangehrmlive.com/";
		System.out.println(url.equals(expectedurl));

		//Page Source and Page length
		String source=cd.getPageSource();
		System.out.println(cd.getPageSource().length());

		cd.close();
	}

}
