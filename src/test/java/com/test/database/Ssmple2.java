package com.test.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ssmple2 {
public static void excel_ReadData() throws IOException {
	File file =new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx");
	FileInputStream fs=new FileInputStream(file);
	Workbook wb=new XSSFWorkbook(fs);
	Sheet sheet = wb.getSheet("dharu");
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	for(int i=0; i<physicalNumberOfRows; i++) {
		Row row = sheet.getRow(i);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for(int j=0; j<physicalNumberOfCells;j++) {
			Cell cell = row.getCell(j);
			System.out.println(cell);
		}
	}
}
public static void main(String[] args) throws IOException {
	excel_ReadData();
}
}
