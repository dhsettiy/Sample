package com.test.data;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class Sample12 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@Test
	public void test() {
		System.out.println("test");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}
}
