package com.web.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PropertiesFileRead {
public static String prop_read(String value) {
	String data=null;
	File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\config.properties");
	try {
		FileReader fr=new FileReader(file);
		Properties prop=new Properties();
		prop.load(fr);
		data = prop.getProperty(value);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;
}
public static String excel_Read(int i, int j) {
	String data=null;
	File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx");
	try {
		FileInputStream fs = new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheet("Sheet2");
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(j);
		int cellType = cell.getCellType();
		if(cellType==1) {
			data = cell.getStringCellValue();
			System.out.println(data);
		}else if(cellType==0) {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sm=new SimpleDateFormat("dd-mm-yyyy");
				data=sm.format(dateCellValue);
				System.out.println(data);
			}else {
				double numericCellValue = cell.getNumericCellValue();
				long lg=(long)numericCellValue;
				data=String.valueOf(lg);
				System.out.println(data);
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
}
