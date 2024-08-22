package com.web.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Excercise4 {
	@Test  (groups= {"Smoke"}) //(priority=3)
	public void test() {
		System.out.println("testvalue");
	}

	@BeforeSuite (groups= {"Sanity"})
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@AfterSuite (groups= {"Regression"})
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	@BeforeClass (groups= {"Sanity"})
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@AfterClass (groups= {"Sanity"})
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest (groups= {"Sanity"})
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	@AfterMethod (groups= {"Smoke"})
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	@BeforeClass
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@Test(priority=2)
	public void testOne() {
		System.out.println("testOne");
	}
	@Test(priority=1)
	public void testTwo() {
		System.out.println("testTwo");
	}
}
