package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class BrokenLink extends SeleniumUtility {
	WebDriver driver;
  @Test
  public void BrokenLinkstest() throws IOException {
	  driver=setUp("Chrome","https://demoqa.com/broken");
	  WebElement element=driver.findElement(By.cssSelector("#Katalon")); // Finding any Link Uniquely
	  String Link=element.getAttribute("href"); //By Using Element get Attribute Value I.e Link of 
	  try {
		URL url=new URL(Link); //Create object of URL Class
		HttpURLConnection httpurl=(HttpURLConnection)url.openConnection();//Create Class of HttpConnection class
		httpurl.setConnectTimeout(5000);
		httpurl.connect();
		if(httpurl.getResponseCode()>=400) {
			System.out.println(Link+" "+httpurl.getResponseCode()+httpurl.getResponseMessage()+" Link is Broken");
		}else {
			System.out.println(Link +" "+httpurl.getResponseCode()+" "+httpurl.getResponseMessage());
		}
	  }catch(Exception e) {
		  
	  }
	
	  
  }
}
