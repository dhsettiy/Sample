package com.web.testng;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class Sample8 {
//@After
//public void getText() {
//	System.out.println("getText");
//}
@Test
public void validation() {
	String s="Dharunya";
	Assert.assertEquals(s,"Dharunya");
	System.out.println("validation");
}
@Test
public void validationOne() {
	int a=20;
	String valueOf = String.valueOf(a);
	Assert.assertTrue(valueOf.contains("20"));
}
@Test
public  void validationTwo() {
	String a="Settiyanna";
	Assert.assertFalse(a.contains("g"));
}
	

@Test
public void test() {
	System.out.println("testClass");
}
}
