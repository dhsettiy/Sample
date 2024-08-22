package com.test.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample4 {
	public static void excel_read() {
		try {
			File file = new File(
					"C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx");
			FileInputStream fs = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fs);
			Sheet sheet = wb.getSheet("dharu");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			for (int i = 0; i < physicalNumberOfRows; i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < physicalNumberOfCells; j++) {
					Cell cell = row.getCell(j);
					//System.out.println(cell);
					int cellType = cell.getCellType();// system understanding language is 0 and 1
					if (cellType == 1) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);
					} else if (cellType == 0) {
						if (DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();
							SimpleDateFormat sm = new SimpleDateFormat("dd-MM-YYYY");
							String format = sm.format(dateCellValue);
							System.out.println(format);
						} else {
							double numericCellValue = cell.getNumericCellValue();
							long l = (long) numericCellValue;
							String valueOf = String.valueOf(l);
							System.out.println(valueOf);
						}
					}
				}

			}

//		Cell cell = row.getCell(0);// ctrl 2 l-> short cut key
//		System.out.println(cell);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		excel_read();
	}
}
