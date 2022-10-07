package cssvalues;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letscode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\AppData\\Letscodeit.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String key=prop.getProperty("key");
		String path=prop.getProperty("path");
		System.setProperty(key, path);
		WebDriver cd=new ChromeDriver();
		String url=prop.getProperty("url");
		cd.get(url);
		System.out.println("-------*--------------*----------**--------------");
		WebElement radiobutton=cd.findElement(By.id("radio-btn-example"));
		String fontsize=radiobutton.getCssValue("font-size");
		String background=radiobutton.getCssValue("background");
		String colour=radiobutton.getCssValue("color");	
		System.out.println("FontSize = "+fontsize);
		System.out.println(" background = "+ background);
		System.out.println("Colour = "+colour);
		System.out.println("------*-------------*****-----------------**----");
		WebElement heading=cd.findElement(By.cssSelector("h1[data-uniqid=\"1621702280245\"]"));
		System.out.println(heading.getCssValue("font-size"));
		System.out.println(heading.getCssValue("color"));
		System.out.println("--**------------------------***------------***-------------");
		WebElement confirm=cd.findElement(By.id("confirmbtn"));
		System.out.println(confirm.getCssValue("background-color"));
		System.out.println(confirm.getCssValue("color"));
		System.out.println(confirm.getCssValue("font-size"));
		
		
	}

}
