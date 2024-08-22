package com.web.testng;

import org.junit.Assert;
import org.junit.Test;

public class Excercise2 {
	@Test
	public void getData() {
		String value = "dharunya";
		Assert.assertTrue(value.contains("dharunya"));
		System.out.println("condition true");
	}

	@Test
	public void getDataOne() {
		String value = "dharunya";
		Assert.assertFalse(value.contains("settiyannan"));
		System.out.println("condition false");
	}

	@Test
	public void getDataTwo() {
		String value = "dharunya";
		Assert.assertEquals(value, "dharunya");
		System.out.println("equals");
	}
}
