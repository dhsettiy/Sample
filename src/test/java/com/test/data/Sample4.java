package com.test.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample4 {
public static void getAllData() {
	try {
		File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestData\\TestData.xlsx");
		FileInputStream input=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(input);
		Sheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();//gives length of the row
		for(int i=0; i<rows; i++) {
			Row row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();//gives length of the cell
			for(int j=0; j<cells; j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void main(String[] args) {
	getAllData();
}
}
