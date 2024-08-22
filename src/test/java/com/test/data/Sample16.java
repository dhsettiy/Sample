package com.test.data;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample16 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuiteOne");
	}

	@BeforeSuite
	public void beforeSuiteOne() {
		System.out.println("beforeSuiteTwo");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforetest");
	}

	@BeforeTest
	public void beforeTestOne() {
		System.out.println("beforetestOne");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@BeforeClass
	public void beforeClassOne() {
		System.out.println("beforeClassOne");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@BeforeMethod
	public void beforeMethodOne() {
		System.out.println("beforeMethodOne");
	}
	@Test
	public void test() {
		System.out.println("test");
	}
	@Test
	public void testOne() {
		System.out.println("testOne");
	}
	
}
