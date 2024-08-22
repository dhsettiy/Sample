package com.test.web;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforemethod");
	}
	@Test
	public void test() {
		System.out.println("test");
	}
}
