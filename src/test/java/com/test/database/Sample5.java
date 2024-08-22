package com.test.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample5 {
public static void excel_Write() throws IOException {
	File file = new File(
			"C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx");
	FileInputStream fs = new FileInputStream(file);
	Workbook wb = new XSSFWorkbook(fs);
	Sheet sheet = wb.createSheet("DataBase");
	Row row = sheet.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue("Welcome to Project Class");
	FileOutputStream outPut=new FileOutputStream(file);
	wb.write(outPut);
	wb.close();
}
public static void main(String[] args) throws IOException {
	excel_Write();
}
}
