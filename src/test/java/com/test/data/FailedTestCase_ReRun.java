package com.test.data;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTestCase_ReRun implements IRetryAnalyzer {
	int min=0; int max=5;
	@Override
	public boolean retry(ITestResult result) {
		
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}

}
