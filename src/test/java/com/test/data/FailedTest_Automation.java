package com.test.data;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;

import org.testng.annotations.ITestAnnotation;

public class FailedTest_Automation implements IAnnotationTransformer {
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	annotation.setRetryAnalyzer(FailedTestCase_ReRun.class);
	}
  
}
