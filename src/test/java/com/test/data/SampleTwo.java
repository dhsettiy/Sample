package com.test.data;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTwo {
	@Test
	public void test() {
		String value="Dharunuya";
       Assert.assertEquals(value, "Dharunuya");
	}
	@Test
	public void testOne() {
		String value="Dharu";
		Assert.assertTrue(value.contains("d"));
	}
	@Test
	public void testTwo() {
		String value="dharunyaSettiuyanna";
		Assert.assertFalse(false, value);
	}
}
