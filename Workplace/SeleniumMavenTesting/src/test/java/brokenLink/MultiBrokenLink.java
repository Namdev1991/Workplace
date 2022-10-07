package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class MultiBrokenLink extends SeleniumUtility {
	WebDriver driver;

	@Test
	public void LinkValidations() throws IOException {
		driver = setUp("Chrome", "https://demoqa.com/broken");
		List<WebElement> listoflink = driver.findElements(By.tagName("a"));
		System.out.println("Size of List = " + listoflink.size());

		for (int i = 0; i < listoflink.size(); i++) {
			WebElement element = listoflink.get(i);
			String link = element.getAttribute("href");
			try {
				URL url = new URL(link);
				HttpURLConnection httpurl = (HttpURLConnection) url.openConnection();
				httpurl.setConnectTimeout(5000);
				httpurl.connect();
				if (httpurl.getResponseCode() >= 400) {
					System.out.println(i + " = " + link + " " + httpurl.getResponseCode() + " "
							+ httpurl.getResponseMessage() + " Link is Broken");
				} else {
					System.out.println(
							i + " = " + link + " " + httpurl.getResponseCode() + " " + httpurl.getResponseMessage());
				}
			} catch (Exception e) {
			}
		}
	}
}
