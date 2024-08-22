package com.test.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
                                                                                                                                                
public class Sample3 {
public static void excelRead() {
	
	try {
		File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestData\\TestData.xlsx");
		FileInputStream in=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(in);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		System.out.println(cell);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void main(String[] args) {
	excelRead();
}
}
