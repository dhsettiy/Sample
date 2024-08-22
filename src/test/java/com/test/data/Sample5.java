package com.test.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample5 {
public static void getAllData_formate() {
	
	try {
		File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestData\\TestData-One.xlsx");
		FileInputStream fs=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();//findout size of row
		for(int i=0; i<physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();//find out size of cell
			for(int j=0; j<physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();//givens cell type
				if(cellType==1) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}else if(cellType==0) {
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat sm=new SimpleDateFormat("dd/mm/yyyy");
						String format = sm.format(dateCellValue);
						System.out.println(format);
					}else {
						double numericCellValue = cell.getNumericCellValue();
						long lc=(long)numericCellValue;
						String valueOf = String.valueOf(lc);
						System.out.println(valueOf);
					}
				}
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
	getAllData_formate();
}
}
