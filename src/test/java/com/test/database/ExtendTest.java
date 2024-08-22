package com.test.database;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ExtendTest implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		ExtendReport.createTest(result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		ExtendReport.extentTest.log(Status.PASS, "Test Case pass");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		ExtendReport.extentTest.log(Status.FAIL, "Test case Failed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		ExtendReport.extentTest.log(Status.SKIP, "Test Cases are Skiped");
	}
	@Override
	public void onStart(ITestContext context) {
		ExtendReport.getInstance();
	}
	@Override
	public void onFinish(ITestContext context) {
		ExtendReport.flush();
	}
}
