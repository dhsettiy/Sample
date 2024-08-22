package com.web.testng;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Excercise {
	@Before
	public void before() {
		System.out.println("before");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}

	@Test
	public void test() {
		System.out.println("test");
	}
	
//	@Test
//	public void test1() {
//		System.out.println("test1");
//	}

	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}

	@After
	public void after() {
		System.out.println("after");
	}
}
