package com.test.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample18 {
public String[][] getExcelData(String fileName, String sheetName){
	String[][] data=null;
	try {
		FileInputStream fs=new FileInputStream(fileName);
		Workbook wb=new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(0);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		data=new String[physicalNumberOfRows][physicalNumberOfCells];
		for (int i = 0; i < physicalNumberOfRows; i++) {
			for(int j=0; j<physicalNumberOfCells; j++) {
				Row row2 = sheet.getRow(i);
				Cell cell = row.getCell(j);
				data[i][j]=cell.getStringCellValue();
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
@DataProvider(name="excelData")
public String[][] getData(){
	String[][] value=getExcelData("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx", "Sheet1");
	return value;
}
@Test(dataProvider="excelData")
public void test(String fileName, String sheetName) {
	System.out.println(fileName + " "+ sheetName);
}

}
