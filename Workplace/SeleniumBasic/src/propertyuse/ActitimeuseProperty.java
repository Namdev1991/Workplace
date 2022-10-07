
package propertyuse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeuseProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\AppData\\actitime.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String key=prop.getProperty("key");
		String path=prop.getProperty("path");
		System.setProperty(key, path);
		WebDriver cd=new ChromeDriver();
		String url=prop.getProperty("url");
		cd.get(url);
	}

}
