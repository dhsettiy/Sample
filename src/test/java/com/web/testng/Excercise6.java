package com.web.testng;

import org.testng.annotations.Test;

public class Excercise6 {
	@Test (groups= {"Smoke"})
	public void test() {
		System.out.println("test");
	}

	@Test(groups= {"Sanity"})
	public void testOne() {
		System.out.println("testOne");
	}

	@Test(groups= {"Regression"})
	public void testTwo() {
		System.out.println("testTwo");
	}
	@Test (groups= {"Smoke"})
	public void testThree() {
		System.out.println("testThree");
	}
}
