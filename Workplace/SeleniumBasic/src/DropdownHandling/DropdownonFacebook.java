package DropdownHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownonFacebook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\AppData\\Facebook.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String key=prop.getProperty("key");
		String path=prop.getProperty("path");
		System.setProperty(key, path);
		WebDriver cd=new ChromeDriver();
		String url=prop.getProperty("url");
		cd.get(url);// -----> Opening Facebook Page 
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.findElement(By.cssSelector("a[data-testid=\"open-registration-form-button\"]")).click();
		//To Write FirstName
		WebElement firstname=cd.findElement(By.cssSelector("input[name=\"firstname\"]"));
		firstname.click();
		firstname.clear();
		String name=prop.getProperty("firstname");
		firstname.sendKeys(name);
		//To Write Last Name
		WebElement lastname=cd.findElement(By.cssSelector("input[name=\"lastname\"]"));
		lastname.click();
		lastname.clear();
		String last=prop.getProperty("lastname");
		lastname.sendKeys(last);
		// To Write Mob No
		WebElement mob=cd.findElement(By.cssSelector("input[name=\"reg_email__\"]"));
		mob.click();
		mob.clear();
		String number=prop.getProperty("Mobno");
		mob.sendKeys(number);
		//To Write Password
		WebElement pass=cd.findElement(By.cssSelector("input[name=\"reg_passwd__\"]"));
		pass.click();
		pass.clear();
		String pw=prop.getProperty("password");
		pass.sendKeys(pw);
		//Date Dropdown Handling
		WebElement date=cd.findElement(By.cssSelector("#day"));
		Select datelist=new Select(date);
		System.out.println("Dropdown is multiple or not = "+datelist.isMultiple());//Multiple Validation
		List<WebElement> dates=datelist.getOptions();
		System.out.println("Total No of Options = "+dates.size());
		datelist.selectByIndex(24);
		//Print All Options
		for(WebElement a:dates) {
			System.out.print(a.getText()+" ");
		}System.out.println();
		//create a New list to store all options
		List<Integer> Itemlist=new ArrayList<Integer>();
		for(WebElement b:dates) {
			String dat=b.getText();
			Itemlist.add(Integer.parseInt(dat));
		}
		System.out.println("Options are in Itemlist "+Itemlist);
		//Create new List for Camparison
		List SortedList=new ArrayList();
		SortedList.addAll(Itemlist);
		//System.out.println("sort = "+SortedList);
		Collections.sort(SortedList);
		System.out.println("Sorted List "+SortedList);//----> Printing the sorted List
		if(Itemlist.equals(SortedList)) {
			System.out.println("Options are sorted in Ascending order");
		}else {
			System.out.println("Options are Not sorted in Ascending order");
		}
		
		//2) Month
		WebElement month=cd.findElement(By.cssSelector("#month"));
		Select monthlist=new Select(month);
		System.out.println("MonthList is Multiple Selection = "+monthlist.isMultiple());
		List<WebElement> months=monthlist.getOptions();
		String monthss="";
		for(int i=0;i<months.size();i++) {
			monthss=monthss+months.get(i).getText()+" ";
		}
		System.out.println(monthss);
		String Expected="Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec";
		System.out.println(monthss.equals(Expected));
		}
}


