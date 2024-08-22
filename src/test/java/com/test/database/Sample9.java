package com.test.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample9 {
public static void file_Write(String testdata) {
	File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\APIDataBaseSheet.xlsx");
	try {
		FileInputStream fs=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(fs);
		Sheet sheet = wb.createSheet("Sheet2");
		for(int i=0; i<5; i++) {
			Row row = sheet.createRow(i);
		for(int j=0; j<5; j++){
			Cell cell = row.createCell(j);
			cell.setCellValue(testdata);
		}
		}
		FileOutputStream fo= new FileOutputStream(file);
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
public static String excel_read() {
	String value=null;
	File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx");
	try {
		FileInputStream fs=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for(int i=0; i<physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0; j<physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				//System.out.println(cell);
				int cellType = cell.getCellType();
				if(cellType==1) {
					value = cell.getStringCellValue();
					System.out.println(value);
				}else if(cellType==0) {
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat sm=new SimpleDateFormat("dd-MM-YYY hh-MM-SS");
						value = sm.format(dateCellValue);
						System.out.println(value);
					}else {
						double numericCellValue = cell.getNumericCellValue();
						long l=(long)numericCellValue;
						value = String.valueOf(l);
						System.out.println(value);
					}
				}
			}
		}
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return value;
}
public static void main(String[] args) {
	file_Write(excel_read());
}
}

