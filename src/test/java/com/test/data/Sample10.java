package com.test.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample10 {
public static void getData(String sheetName, String value) {
	try {
		//String data=null;
		File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx");
		FileInputStream fs=new FileInputStream(file);
		Workbook ws=new XSSFWorkbook(fs);
	Sheet sheet = ws.createSheet(sheetName);
	Row row = sheet.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue(value);
	FileOutputStream fo=new FileOutputStream(file);
	ws.write(fo);
	ws.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	getData("Dharunya1","Capgemini");
}
}
