package com.test.data;

import org.testng.annotations.DataProvider;

public class ProviderData {
	@DataProvider(name="getData")

	public static Object[][] getExcelData(String string, String string2) {
		Object[][] excelData = getExcelData("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx", "Sheet1");
		return excelData;
	}
}
