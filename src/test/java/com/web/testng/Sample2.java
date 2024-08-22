package com.web.testng;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample2 {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}

	@Test
	public void test() {
		System.out.println("test");
	}

	@After
	public void after() {
		System.out.println("after");
	}
}
