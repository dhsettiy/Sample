package com.test.data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample19 {
	@DataProvider(name = "excelData")
	 public  String[][] excelDataProvider() throws IOException{
	String[][] arrObj = dpMethod("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx","Sheet1");
	        return arrObj;
	}
	
	public String[][] dpMethod(String a,String b) throws IOException{
		String [] [] data =null;
		
		 FileInputStream fis = new FileInputStream(a);
			
			 XSSFWorkbook workbook = new XSSFWorkbook(fis); 
			Sheet sheet =workbook.getSheet(b); 
			 Row row = sheet.getRow(0);
			 
		 
		  int noOfRows = sheet.getPhysicalNumberOfRows(); //6
       int noOfCols = row.getPhysicalNumberOfCells();  //1
       Cell cell;
       data = new String[noOfRows ][noOfCols];

       for (int i = 0; i < noOfRows; i++) {//outerloop
           for (int j = 0; j < noOfCols; j++) {//innerloop
               row = sheet.getRow(i);
               cell = row.getCell(j);
               data[i][j] = cell.getStringCellValue();
              
           }
		
	}
       return data;
     
	}
	@Test(dataProvider = "excelData")
	  public void sampleOne(String a ,String b) {
		System.out.println(a+"  "+b);
	
}
}
