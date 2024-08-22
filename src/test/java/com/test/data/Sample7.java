package com.test.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample7 {
public static void excel_Write(String sheetName, String testData) {
	try {
		File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx");
		FileInputStream fs=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(fs);
		//Workbook wb1= new XSSFWorkbook(fs);
		Sheet sheet = wb.createSheet(sheetName);
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue(testData);
		FileOutputStream wr=new FileOutputStream(file);
		wb.write(wr);
		wb.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void main(String[] args) {
	excel_Write(Sample6.passAll_Data(1, 1), Sample6.passAll_Data(1, 3));
}
}
