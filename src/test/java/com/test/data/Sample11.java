package com.test.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample11 {
public static void excel_write(String sheetName, String data) {
	
	try {
		File file =new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx");
		FileInputStream fs=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(fs);
	Sheet sheet=	wb.createSheet(sheetName);
	Row row = sheet.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue(data);
	FileOutputStream fo=new FileOutputStream(file);
	wb.write(fo);
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
	excel_write("dharu", "write value");
}
}
