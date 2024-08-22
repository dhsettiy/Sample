package com.web.testng;

import org.junit.Assert;
import org.junit.Test;

public class Sample9 {
@Test
public void test() {
	String a="Dharunya";
	Assert.assertEquals(a, "Dharunya");
	System.out.println("validationOne");
	}
@Test
public void testOne() {
	String a="contains";
	Assert.assertFalse(a.contains("f"));
	System.out.println("ValidationTwo");
}
@Test
public void testTwo() {
	String b="work";
	Assert.assertTrue(b.contains("w"));
	System.out.println("ValidationThree");
}
}
