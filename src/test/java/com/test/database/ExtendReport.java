package com.test.database;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReport {
	public static ExtentSparkReporter sparkReport = null;//UI configuration work
	public static ExtentReports extentReport = null;//project details
	public static ExtentTest extentTest = null;//invoke test cases
	public static String reportLocation = System.getProperty("user.dir") + "/reports/unitReport.html";

	public static ExtentReports createReport() {
		sparkReport = new ExtentSparkReporter(reportLocation);
		sparkReport.config().setDocumentTitle("TestCaseFile");
		sparkReport.config().setTheme(Theme.DARK);
		sparkReport.config().setReportName("DharunyaSettiyannan Report");
		extentReport = new ExtentReports();
		extentReport.attachReporter(sparkReport);
		extentReport.setSystemInfo("Name", "Dharunya");
		extentReport.setSystemInfo("Age", "TwentyFour");
		extentReport.setSystemInfo("Company", "Capgemini");
		extentReport.setSystemInfo("Learning", "Testing");
		return extentReport;
	}
	public static void createTest(String name) {
		extentTest = extentReport.createTest(name);//name is argument of passing test cases
	}
	public static void flush() {
		extentReport.flush();
	}
  public static ExtentReports getInstance() {
	  if(extentReport==null) {
		  return createReport();
	  }
	  return extentReport;
  }
}
