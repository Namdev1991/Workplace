package DataDriventesting;

import utility.SeleniumUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenPractice extends SeleniumUtility {
	WebDriver driver;
	String url, username, password;

	@BeforeTest
	public void getData() throws IOException {
		FileInputStream fis = new FileInputStream("M:\\Workplace\\SeleniumMavenTesting\\src\\test\\resources\\TestData\\Testdata.xlsx");
		Workbook wbk = new XSSFWorkbook(fis);
		Sheet sheet = wbk.getSheet("Sheet3");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		url = cell.getStringCellValue();
		//url=wbk.getSheet("Sheet3").getRow(1).getCell(0).getStringCellValue();//------> Optimization of code in One Line
		username = row.getCell(1).getStringCellValue();
		password = row.getCell(2).getStringCellValue();
	}
	@Test
	public void getSheetdetails() throws IOException {
		//No of Sheets
		FileInputStream fis = new FileInputStream("M:\\Workplace\\SeleniumMavenTesting\\src\\test\\resources\\TestData\\Testdata.xlsx");
		Workbook wbk = new XSSFWorkbook(fis);
		int sheetcount=wbk.getNumberOfSheets();
		//Get Name of Each Sheet
		for(int i=0;i<sheetcount;i++) {
			System.out.println(wbk.getSheetAt(i).getSheetName());
		}
	}
	@Test 
	public void getRowDetails() throws IOException {
		FileInputStream fis = new FileInputStream("M:\\Workplace\\SeleniumMavenTesting\\src\\test\\resources\\TestData\\Testdata.xlsx");
		Workbook wbk = new XSSFWorkbook(fis);
		Sheet sheet=wbk.getSheet("Sheet3");
		//No of Rows Present in a Sheet
		int rowcount=sheet.getLastRowNum();
		System.out.println("RowCount = "+rowcount);	
	}
	@Test
	public void getCellDetails() throws IOException {
		FileInputStream fis = new FileInputStream("M:\\Workplace\\SeleniumMavenTesting\\src\\test\\resources\\TestData\\Testdata.xlsx");
		Workbook wbk = new XSSFWorkbook(fis);
		Row row=wbk.getSheet("Sheet3").getRow(1);
		int cellcount=row.getLastCellNum();
		// Printing Each Cell value
		for(int i=0;i<cellcount;i++) {
			System.out.println(row.getCell(i).getStringCellValue());
		}
	}
	@Test
	public void OpenAppl() {
		driver = setUp("chrome", url);
		WebElement user=driver.switchTo().activeElement();
		user.clear();
		user.sendKeys(username,Keys.TAB);
		driver.switchTo().activeElement().sendKeys(password,Keys.ENTER);
	}
}
