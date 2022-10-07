package cssvalues;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocations {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\AppData\\Letscodeit.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String key=prop.getProperty("key");
		String path=prop.getProperty("path");
		System.setProperty(key, path);
		WebDriver cd=new ChromeDriver();
		String url=prop.getProperty("url");
		cd.get(url);
		WebElement radiobutton=cd.findElement(By.xpath("//legend[text()='Radio Button Example']"));
		Point location=radiobutton.getLocation();
		System.out.println(location);
		int radiox=location.getX();
		int radioy=location.getY();
		WebElement select=cd.findElement(By.xpath("//legend[text()='Select Class Example']"));
		Point locate=select.getLocation();
		int selectx=locate.getX();
		int selecty=locate.getY();
		if(radiox<selectx) {
			System.out.println("Select is on Right side of radio");
		}
	}

}
