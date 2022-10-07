package basicselenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AssAmazon {

	public static void main(String[] args) {

		String str=System.getProperty("user.dir");
		String path=str.concat("\\Executables\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver cd=new FirefoxDriver();

		cd.get("https://www.amazon.in/");

		//Validate url
		String expected="https://www.amazon.in/";
		String url=cd.getCurrentUrl();
		System.out.println(expected.equals(url));

		//validate Title
		String expectedtitle="<Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping &amp; Cash on Delivery Available.";
		String title=cd.getTitle();
		System.out.println(expectedtitle.contains(title));

		//Validate PageSource
		String source=cd.getPageSource();
		System.out.println(cd.getPageSource().length());

		//Close 
		cd.close();
	}
}
