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



public class Sample17 {
@DataProvider(name="getData")
public static Object[][] getExcelData() {
	Object[][] excelData = getExcelValue("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx","Sheet1");
	return excelData;
}
public static Object[][] getExcelValue(String fileName, String sheetName){
	String[][] data=null;
	try {
		FileInputStream is=new FileInputStream(fileName);
		Workbook wb=new XSSFWorkbook(is);
		Sheet sheet=wb.getSheet(sheetName);
		Row row = sheet.getRow(0);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		int lastCellNum = row.getLastCellNum();
		
		data=new String[physicalNumberOfRows-1][lastCellNum];
		for(int i=0; i<physicalNumberOfRows; i++) {
			for(int j=0; j<lastCellNum; j++) {
			sheet.getRow(i);
			Cell cell = row.getCell(j);
			data[i-1][j]=cell.getStringCellValue();
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
@Test(dataProvider="getData")
public void getTest(String fileName, String sheetName) {
	System.out.println(fileName + " " + sheetName);
}

}