package com.test.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi;

public class Sample9 {
public static String fileRead(int i, int j) {	
	String value=null;
	try {
		File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestData\\TestData.xlsx");
		FileInputStream fs=new FileInputStream(file);
		Workbook bs=new XSSFWorkbook(fs);
	Sheet sheet=bs.getSheet("Sheet1");
	Row row = sheet.getRow(i);
	Cell cell = row.getCell(j);
	int cellType = cell.getCellType();
	if(cellType==1) {
		value = cell.getStringCellValue();
		System.out.println(value);
	}else if(cellType==0) {
		if(DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat sm=new SimpleDateFormat("DD-MM-YYYY");
			value= sm.format(dateCellValue);
			System.out.println(value);
		}else {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long)numericCellValue;
			value = String.valueOf(l);
			System.out.println(value);
		}
	}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return value;
	}
public static void main(String[] args) {
	fileRead(1,1);
}
}
