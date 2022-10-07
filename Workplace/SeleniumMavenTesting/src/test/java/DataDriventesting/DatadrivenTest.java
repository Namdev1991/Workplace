package DataDriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class DatadrivenTest extends SeleniumUtility {
  @Test
  public void Login() throws IOException {
	  //Step 1 ----> Get File from Folder
	  FileInputStream fis=new FileInputStream("M:\\Workplace\\SeleniumMavenTesting\\src\\test\\resources\\TestData\\TestDataforPractice.xlsx");
	  //Create Instance of Workbook
	  Workbook wbk=new XSSFWorkbook(fis);
	  //Get Cell Details from workbook
	  int rowcount=wbk.getSheet("Sheet3").getLastRowNum();
	  
	  for(int i=1;i<=rowcount;i++) {
	  String url=wbk.getSheet("Sheet3").getRow(i).getCell(0).getStringCellValue();
	  String username=wbk.getSheet("Sheet3").getRow(i).getCell(1).getStringCellValue();
	  String pwd=wbk.getSheet("Sheet3").getRow(i).getCell(2).getStringCellValue();
	  WebDriver driver=setUp("chrome",url);
	  if(i==5 ||i==6) {
	  WebDriverWait wait=new WebDriverWait(driver,5);
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name=\"username\" and @placeholder=\"Username\"]"))));
	  }
	  WebElement uN=driver.switchTo().activeElement();
	  uN.clear();
	  uN.sendKeys(username,Keys.TAB);
	  WebElement pw=driver.switchTo().activeElement();
	  pw.clear();
	  pw.sendKeys(pwd,Keys.ENTER);
	  driver.close();
	  }
	  //To Update any Cell 
	  Cell cl=wbk.getSheet("Sheet3").getRow(1).createCell(5);
	  cl.setCellValue("Pass");
	  FileOutputStream fos=new FileOutputStream("M:\\\\Workplace\\\\SeleniumMavenTesting\\\\src\\\\test\\\\resources\\\\TestData\\\\TestDataforPractice.xlsx");
	  wbk.write(fos);
	  fos.close();
  }
}
