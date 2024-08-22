package com.test.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample6 {
public static String passAll_Data(int i, int j) {//read
	String data=null;
	try {
		File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestData\\TestData.xlsx");
		FileInputStream fs=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheet("AdactinHotel");
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(j);
		int cellType = cell.getCellType();// what's this cell type-0,1->machine lang.. 0and1 1-string 0-> date and number
		if(cellType==1) {
			data = cell.getStringCellValue();
			System.out.println(data);
		}else if(cellType==0) {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sm=new SimpleDateFormat("dd-mm-yyyy");
				data=sm.format(dateCellValue);
				System.out.println(data);
			}else {
				double numericCellValue = cell.getNumericCellValue();
				long lg=(long)numericCellValue;
				data=String.valueOf(lg);
				System.out.println(data);
			}
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;
}
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(passAll_Data(1,0));
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passAll_Data(1,0));
	driver.findElement(By.xpath("//input[@type='Submit']")).click();
}
}
