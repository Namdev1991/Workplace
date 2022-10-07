package basicselenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AssFbByFire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=System.getProperty("user.dir");
		String str1="\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", str+str1);
		
		FirefoxDriver cd=new FirefoxDriver();
		cd.get("https://www.facebook.com");
		//1)Fetching Title and Verify
		String Expectedtitle="Facebook – log in or sign up";
		String title=cd.getTitle();
		System.out.println(Expectedtitle.contains(title));
		System.out.println(title);
		cd.close();
	}
}
