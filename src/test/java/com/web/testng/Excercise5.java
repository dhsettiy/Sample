package com.web.testng;

import org.testng.annotations.Test;

public class Excercise5 {
	@Test(priority=3)
	public void test() {
		System.out.println("test");
	}

	@Test(priority=1)
	public void testOne() {
		System.out.println("testOne");
	}

	@Test(priority=4)
	public void testTwo() {
		System.out.println("testTwo");
	}

	@Test(priority=3)
	public void testThree() {
		System.out.println("testThree");
	}
	@Test
	public void testFour() {
		System.out.println("testThree");
	}
}
